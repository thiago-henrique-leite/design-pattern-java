package design_patterns.padroes.decorator.text_decorator;

public class TextDecorator implements TextInterface {
	
	TextInterface textObject;
	
	public TextDecorator(TextInterface text) {
		this.textObject = text;
	}
	
	@Override
	public String getText() {
		return this.textObject.getText();
	}
}
