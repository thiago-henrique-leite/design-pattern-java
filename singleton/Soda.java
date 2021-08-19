package design_patterns.padroes.singleton;

public class Soda {
	
	private String label;
	
	public Soda(String label) {
		setLabel(label);
	}
	
	public void setLabel(String label) {
		this.label = label;		
	}
	
	public void on() {
		System.out.println("Máquina de Refrigerante " + label + ": ligando.");
	}
	
	public void off() {
		System.out.println("Máquina de Refrigerante " + label + ": desligando.");
	}
	
	public void getSoda() {
		System.out.println("Máquina de Refrigerante " + label + ": despejando refrigerante.");
	}
	
	public void putOnIce() {
		System.out.println("Máquina de Refrigerante " + label + ": colocando gelo no refrigerante.");
	}
}