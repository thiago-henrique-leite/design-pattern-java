package design_patterns.padroes.decorator.text_decorator;

public class TextBetweenTagsDecorator extends TextDecorator {

	public TextBetweenTagsDecorator(TextInterface text) {
		super(text);
	}
	
	public String getText() {
		return "<b>" + textObject.getText() + "</b>";
	}
}
