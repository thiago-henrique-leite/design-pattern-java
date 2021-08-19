package design_patterns.padroes.singleton;

public class Popcorn {
	
	private String label;
	
	public Popcorn(String label) {
		setLabel(label);
	}
	
	public void setLabel(String label) {
		this.label = label;		
	}
	
	public void on() {
		System.out.println("Pipoqueira " + label + ": ligando.");
	}
	
	public void off() {
		System.out.println("Pipoqueira " + label + ": desligando.");
	}
	
	public void makePopcorn() {
		System.out.println("Pipoqueira " + label + ": fazendo pipoca.");
	}
	
	public void putOnButter() {
		System.out.println("Pipoqueira " + label + ": colocando manteiga na pipoca.");
	}
	
	public void putOnSalt() {
		System.out.println("Pipoqueira " + label + ": colocando sal na pipoca.");
	}
}
