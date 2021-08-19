package design_patterns.padroes.state;

public class ClosedState implements State {

	@Override
	public void click() {
		System.out.println("ClosedState: Porta está fechada!");
	}

}
