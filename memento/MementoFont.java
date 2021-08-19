package design_patterns.padroes.memento;

public class MementoFont {
	
	private String state;
	
	public Memento createMemento() {
		return new Memento(state);
	}
	
	public void setMemento(Memento memento) {
		this.state = memento.getState();
	}
	
	public void changeState(String str) {
		this.state = str;
	}
	
	public String getState() {
		return this.state;
	}
	
}
