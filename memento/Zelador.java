package design_patterns.padroes.memento;

import java.util.Stack;

public class Zelador {
	
	private Stack<Memento> states = new Stack<Memento>();
	
	private MementoFont font;
	
	public Zelador(MementoFont font) {
		this.font = font;
	}
	
	public void saveState() {
		states.push(font.createMemento());
	}
	
	public void undo() {
		if(!states.isEmpty())
			font.setMemento(states.pop());
	}
}
