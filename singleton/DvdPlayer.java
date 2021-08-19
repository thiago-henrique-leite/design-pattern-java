package design_patterns.padroes.singleton;

public class DvdPlayer extends Player {
	
	Projector projector;
	Amplifier amplifier;
	String label;
	String currentDvd="";
	
	public DvdPlayer(String label, Amplifier amplifier, Projector projector) {
		setLabel(label);
	}
	
	public void setLabel(String label) {
		this.label = label;		
	}
	
	public void setAmplifier(Amplifier amplifier) {
		System.out.println("DvdPlayer " + label + ": definindo amplificador " + amplifier.getLabel() + ".");
		this.amplifier = amplifier;
	}
	
	public void setMultimediaProjector(Projector projector) {
		System.out.println("DvdPlayer " + label + ": definindo projetor de mídia " + projector.getLabel() + ".");
		this.projector = projector;
	}
	
	public void setCurrentDvd(String dvd) {
		this.currentDvd = dvd;
	}
	
	
	public void on() {
		System.out.println("DvdPlayer " + label + ": ligando.");
	}

	public void off() {
		System.out.println("DvdPlayer " + label + ": desligando.");
	}

	public void play() {
		if(currentDvd.isEmpty())
			noneDvdInsertedError();
		else
			System.out.println("DvdPlayer " + label + ": reproduzindo dvd " + currentDvd + ".");
	}

	public void pause() {
		if(currentDvd.isEmpty())
			noneDvdInsertedError();
		else
			System.out.println("DvdPlayer " + label + ": pausando dvd " + currentDvd + ".");
	}

	public void stop() {
		if(currentDvd.isEmpty())
			noneDvdInsertedError();
		else
			System.out.println("DvdPlayer " + label + ": parando reprodução do dvd " + currentDvd + ".");
	}

	public void insert(String dvd) {
		if(currentDvd.isEmpty()) {
			System.out.println("DvdPlayer " + label + ": inserindo DVD " + dvd + ".");
			setCurrentDvd(dvd);
		}
		else 
			dvdAlreadyInsertedError();
	}

	public void eject() {
		if(!currentDvd.isEmpty()) {
			System.out.println("DvdPlayer " + label + ": ejetando dvd " + currentDvd + ".");
			setCurrentDvd(null);
		} else { 
			noneDvdInsertedError();
		}
	}
	
	public void advanceTenSeconds() {
		System.out.println("DvdPlayer " + label + ": avançando 10 segundos.");
	}
	
	public void backTenSeconds() {
		System.out.println("DvdPlayer " + label + ": voltando 10 segundos.");
	}
	
	public void setVolume(int volume) {
		if(volume < 0)
			amplifier.decreaseVolume(volume);
		else
			amplifier.increaseVolume(volume);
	}
	
	private void dvdAlreadyInsertedError() {
		System.out.println("DvdPlayer " + label + ": já existe um dvd inserido.");
	}
	
	private void noneDvdInsertedError() {
		System.out.println("DvdPlayer " + label + ": nenhum dvd inserido.");
	}
}
