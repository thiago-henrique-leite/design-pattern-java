package design_patterns.padroes.decorator.text_decorator;

public class TextUppercaseDecorator extends TextDecorator {

	public TextUppercaseDecorator(TextInterface text) {
		super(text);
	}
	
	public String getText() {
		return textObject.getText().toUpperCase();
	}
}
