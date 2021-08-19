package design_patterns.padroes.decorator.text_decorator;

public class Main {
	
	public static void main(String args[]) {
		
		Text text = new Text("Testando o padrão decorator");
		TextUppercaseDecorator textUppercase = new TextUppercaseDecorator(text);
		TextInvertedDecorator textInverted = new TextInvertedDecorator(textUppercase);
		TextBetweenTagsDecorator textBetweenTags = new TextBetweenTagsDecorator(textInverted);
		
		System.out.println(textBetweenTags.getText());
	}
}
