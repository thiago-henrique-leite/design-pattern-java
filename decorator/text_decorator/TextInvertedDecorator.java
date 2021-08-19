package design_patterns.padroes.decorator.text_decorator;

public class TextInvertedDecorator extends TextDecorator {

	public TextInvertedDecorator(TextInterface text) {
		super(text);
	}
	
	public String getText() {
		String invertedText = "";
		
		String text = this.textObject.getText();
		
		char[] charArray = text.toCharArray();
		
		int j = charArray.length - 1;
		
		for(int i=0; i < text.length(); i++) {
			invertedText = invertedText.concat(Character.toString(text.charAt(j)));
			j--;
		}
		
		return invertedText;
	}
}
