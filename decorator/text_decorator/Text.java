package design_patterns.padroes.decorator.text_decorator;

public class Text implements TextInterface {
	
	private String text;
	
	public Text(String text) {
		this.text = text;
	}
	
	@Override
	public String getText() {
		return this.text;
	}
}
