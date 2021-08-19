package design_patterns.padroes.state;

public class Door {
	
	private final State OPENED = new OpenedState();
	private final State CLOSED = new ClosedState();
	
	private State state;
	
	public Door() {
		this.state = CLOSED;
	}
	
	public void setState(State state) {
		this.state = state;
	}
	
	public Door open() {
		this.state = OPENED;
		
		return this;
	}
	
	public Door close() {
		this.state = CLOSED;
		
		return this;
	}
	
	public void click() {
		state.click();
	}
}
