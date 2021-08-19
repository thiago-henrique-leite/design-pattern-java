package design_patterns.padroes.state;

public class OpenedState implements State {

	@Override
	public void click() {
		System.out.println("OpenedState: Porta está aberta!");
	}

}
