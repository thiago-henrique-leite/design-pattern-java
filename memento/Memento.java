package design_patterns.padroes.memento;

public class Memento {
	
	private String state;
	
	public Memento(String state){
		setState(state);
	}
	
	public String getState() {
		return state;
	}
	
	public void setState(String state) {
		this.state = state;
	}
}
