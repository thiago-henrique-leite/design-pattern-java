package design_patterns.padroes.memento;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class MementoAplication extends JFrame {
	
	private static final long serialVersionUID = 1L;
	
	private JFrame frame;
	
	private JButton saveButton;
	private JButton undoButton;
	
	private JTextArea textArea;
	private JTextField textField;
	
	private JScrollPane scrollPane;
	
	private MementoFont fontTextField;
	private MementoFont fontTextArea;
	private Zelador zeladorTextField;
	private Zelador zeladorTextArea;

	public MementoAplication() {
		this.frame = new JFrame();
		this.saveButton = new JButton("Salvar");
		this.undoButton = new JButton("Desfazer");
		
		this.textArea = new JTextArea();
		this.textField = new JTextField();
		
		this.scrollPane = new JScrollPane(textArea);
		
		this.fontTextField = new MementoFont();
		this.fontTextArea  = new MementoFont();
		this.zeladorTextField = new Zelador(fontTextField);
		this.zeladorTextArea  = new Zelador(fontTextArea);
	}
	
	public void perform() {
		setScrollPaneParams();
		setButtonDefaultParams(saveButton, 0x99CC32);
		setButtonDefaultParams(undoButton, 0xFA8072);
		setFrameParams();
		setTextFieldParams();
		defineSaveButtonAction();
		defineUndoButtonAction();
		addFrameComponents();
		
		textArea.setEditable(false);
		frame.setVisible(true);
		
		pack();
	}
	
	public void setScrollPaneParams() {
		scrollPane.setPreferredSize(new Dimension(400, 300));
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
	}
	
	public void setFrameParams() {
		frame.setSize(800, 500);
		frame.setLocationRelativeTo(null); 
		frame.setTitle("Padrão de Projeto - Memento");
		frame.getContentPane().setBackground(new Color(0xF5F5DC));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout());
	}
	
	public void setButtonDefaultParams(JButton button, int color) {
		button.setBounds(30, 30, 30, 30);
		button.setBackground(new Color(color));
		button.setFont(new Font("Comic Sans", Font.CENTER_BASELINE, 15));
		button.setBorder(BorderFactory.createEtchedBorder());
		button.setFocusable(true);
	}
	
	public void setTextFieldParams() {
		textField.setBounds(100,100,300,200);
		textField.setColumns(30);
		textField.setHorizontalAlignment(JTextField.CENTER);
	}
	
	public void defineSaveButtonAction() {
		saveButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fontTextArea.changeState(textArea.getText());
				zeladorTextArea.saveState();	
				
				textArea.setText(textArea.getText() + textField.getText() + "\n");
				
				fontTextField.changeState(textField.getText());
				zeladorTextField.saveState();
				
				textField.setText("");
			}
		});
	}
	
	public void defineUndoButtonAction() {
		undoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				zeladorTextField.undo();
				textField.setText(fontTextField.getState());
				
				zeladorTextArea.undo();
				textArea.setText(fontTextArea.getState());
			}
		});
	}
	
	public void addFrameComponents() {
		frame.add(textField);
		frame.add(saveButton);
		frame.add(undoButton);
		frame.add(scrollPane);
	}
	
	public static void main(String[] args) {
     	new MementoAplication().perform();
	}
}