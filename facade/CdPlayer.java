package design_patterns.padroes.facade;

public class CdPlayer extends Player {

	Amplifier amplifier;
	String label;
	String currentCd="";
	
	public CdPlayer(String label, Amplifier amplifier) {
		setLabel(label);
	}
	
	public void setLabel(String label) {
		this.label = label;		
	}
	
	public void setAmplifier(Amplifier amplifier) {
		this.amplifier = amplifier;
	}
	
	public void setCurrentCd(String cd) {
		this.currentCd = cd;
	}
	
	public void on() {
		System.out.println("CdPlayer " + label + ": ligando.");
	}

	void off() {
		System.out.println("CdPlayer " + label + ": desligando.");
	}

	public void play() {
		if(currentCd.isEmpty())
			noneCdInsertedError();
		else
			System.out.println("CdPlayer " + label + ": reproduzindo cd " + currentCd + ".");
	}

	public void pause() {
		if(currentCd.isEmpty())
			noneCdInsertedError();
		else
			System.out.println("CdPlayer " + label + ": pausando cd " + currentCd + ".");
	}

	public void stop() {
		if(currentCd.isEmpty())
			noneCdInsertedError();
		else
			System.out.println("CdPlayer " + label + ": parando reprodução do cd " + currentCd + ".");
	}

	public void insert(String cd) {
		if(currentCd.isEmpty()) {
			setCurrentCd(cd);
			System.out.println("CdPlayer " + label + ": inserindo cd " + cd + ".");
		}
		else 
			cdAlreadyInsertedError();
	}

	public void eject() {
		if(!currentCd.isEmpty()) {
			System.out.println("CdPlayer " + label + ": ejetando cd " + currentCd + ".");
			setCurrentCd(null);
		} else { 
			noneCdInsertedError();
		}
	}
	
	public void nextSound() {
		System.out.println("CdPlayer " + label + ": passando para próxima faixa.");
	}
	
	public void previousSound() {
		System.out.println("CdPlayer " + label + ": passando para faixa anterior.");
	}
	
	public void setVolume(int volume) {
		if(volume < 0)
			amplifier.decreaseVolume(volume);
		else
			amplifier.increaseVolume(volume);
	}
	
	private void cdAlreadyInsertedError() {
		System.out.println("CdPlayer " + label + ": já existe um cd inserido.");
	}
	
	private void noneCdInsertedError() {
		System.out.println("CdPlayer " + label + ": nenhum cd inserido.");
	}
}
