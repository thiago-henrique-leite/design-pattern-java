package design_patterns.padroes.facade;

public class SodaMachine {
	
	private String label;
	
	public SodaMachine(String label) {
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