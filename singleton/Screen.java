package design_patterns.padroes.singleton;

public class Screen {
	
	private String label;
	
	public Screen(String label) {
		setLabel(label);
	}
	
	public void setLabel(String label) {
		this.label = label;
	}
	
	public String getLabel(String label) {
		return this.label;
	}
	
	public void on() {
		System.out.println("Tela " + label + ": ligando.");
	}
	
	public void off() {
		System.out.println("Tela " + label + ": desligando.");
	}
	
	public void putOnStandBy() {
		System.out.println("Tela " + label + ": colocando em standby.");
	}
	
	public void changeImageMode() {
		System.out.println("Tela " + label + ": trocando modo de exibição da imagem.");
	}
}
