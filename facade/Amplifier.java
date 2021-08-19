package design_patterns.padroes.facade;

public class Amplifier {
	
	private Tuner tuner;
	private String label;
		
	public Amplifier(String label, Tuner tuner) {
		setLabel(label);
		setTuner(tuner);
	}
	
	public String getLabel() {
		return this.label;
	}
	
	public void setLabel(String label) {
		this.label = label;		
	}
	
	public void setTuner(Tuner tuner) {
		this.tuner = tuner;
	}
	
	public Tuner getTuner() {
		return this.tuner;
	}
	
	public void on() {
		System.out.println("Amplificador " + label + ": ligando.");
	}
	
	public void off() {
		System.out.println("Amplificador " + label + ": desligando.");
	}
	
	public void increaseVolume(int volume) {
		System.out.println("Amplificador " + label + ": aumentando em " + volume + " o volume.");
	}
	
	public void decreaseVolume(int volume) {
		System.out.println("Amplificador " + label + ": diminuindo em " + volume + " o volume.");
	}
}
