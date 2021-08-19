package design_patterns.padroes.facade;

public class AmbientLight {
	
	private String label;
	
	public AmbientLight(String label) {
		setLabel(label);
	}
	
	public void setLabel(String label) {
		this.label = label;
	}
	
	public void on() {
		System.out.println("Luz ambiente " + label + ": ligando.");
	}
	
	public void off() {
		System.out.println("Luz ambiente " + label + ": desligando.");
	}
	
	public void increaseIntensity() {
		System.out.println("Luz ambiente " + label + ": aumentando intensidade da luz.");
	}
	
	public void decreaseIntensity() {
		System.out.println("Luz ambiente " + label + ": diminuindo intensidade da luz.");
	}
	
	public void changeColor(String color) {
		System.out.println("Luz ambiente " + label + ": trocando cor para " + color + ".");
	}
}
