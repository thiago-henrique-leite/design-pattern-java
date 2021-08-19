package design_patterns.padroes.singleton;

public class Tuner {
	
	private String label;
		
	public Tuner(String label) {
		setLabel(label);
	}
	
	public String getLabel() {
		return this.label;
	}
	
	public void setLabel(String label) {
		this.label = label;		
	}
	
	public void on() {
		System.out.println("Sintonizador " + label + ": ligando.");
	}
	
	public void off() {
		System.out.println("Sintonizador " + label + ": desligando.");
	}
	
	public void amMode() {
		System.out.println("Sintonizador " + label + ": modo AM.");
	}
	
	public void fmMode() {
		System.out.println("Sintonizador " + label + ": modo FM.");
	}
}
