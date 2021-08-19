package design_patterns.padroes.singleton;

public class Projector {
	
	private String label;
	
	public Projector(String label) {
		setLabel(label);
	}
	
	public void setLabel(String label) {
		this.label = label;
	}
	
	public String getLabel() {
		return this.label;
	}
	
	public void on() {
		System.out.println("Projector " + label + ": ligando.");
	}

	public void off() {
		System.out.println("Projector " + label + ": desligando.");
	}
	
	public void selectGameMode() {
		System.out.println("Projector " + label + ": selecionando modo de jogo.");
	}
	
	public void setGlare(int glare) {
		System.out.println("Projector " + label + ": definindo brilho em " + glare + ".");
	}
}
