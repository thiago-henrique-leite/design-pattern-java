package design_patterns.padroes.facade;

public class HomeTheaterFacade {
	
	AmbientLight ambientLigth;
	Amplifier amplifier;
	CdPlayer cdPlayer;
	DvdPlayer dvdPlayer;
	MultimediaProjector projector;
	PopcornMachine popcorn;
	ProjectionScreen screen;
	SodaMachine soda;
	Tuner tuner;
	
	public HomeTheaterFacade(AmbientLight ambientLigth,
							 Amplifier amplifier,
							 CdPlayer cdPlayer,
							 DvdPlayer dvdPlayer,
							 MultimediaProjector projector,
							 PopcornMachine popcorn,
							 ProjectionScreen screen,
							 SodaMachine soda,
							 Tuner tuner
							) 
	{
		this.ambientLigth = ambientLigth;
		this.amplifier = amplifier;
		this.cdPlayer = cdPlayer;
		this.dvdPlayer = dvdPlayer;
		this.projector = projector;
		this.popcorn = popcorn;
		this.screen = screen;
		this.soda = soda;
		this.tuner = tuner;
	}
	
	public void init() {
		System.out.println("\n==> HomeTheater Facade: iniciando.\n");
		screen.on();
		ambientLigth.on();
	}
	
	public void dvdPlay(String dvd) {
		System.out.println("\n==> HomeTheater Facade: assistir dvd.\n");
		screen.on();
		dvdPlayer.on();
		dvdPlayer.setAmplifier(amplifier);
		amplifier.on();
		amplifier.setTuner(tuner);
		amplifier.increaseVolume(20);
		tuner.on();
		dvdPlayer.setMultimediaProjector(projector);
		projector.on();
		projector.setGlare(100);
		dvdPlayer.insert(dvd);
		dvdPlayer.play();
	}
	
	public void cdPlay(String cd) {
		System.out.println("\n==> HomeTheater Facade: escutar cd.\n");
		cdPlayer.on();
		screen.putOnStandBy();
		cdPlayer.setAmplifier(amplifier);
		amplifier.on();
		amplifier.setTuner(tuner);
		amplifier.increaseVolume(30);
		tuner.on();
		cdPlayer.insert(cd);
		cdPlayer.play();
	}
	
	public void stopWatch() {
		System.out.println("\n==> HomeTheater Facade: parar de assistir.\n");
		dvdPlayer.stop();
		dvdPlayer.eject();
		dvdPlayer.off();
		amplifier.off();
		tuner.off();
		projector.off();
		screen.putOnStandBy();
	}
	
	public void stopListen() {
		System.out.println("\n==> HomeTheater Facade: parar de ouvir.\n");
		cdPlayer.eject();
		cdPlayer.off();
		amplifier.off();
		tuner.off();
	}
	
	public void getPopcorn() {
		System.out.println("\n==> HomeTheater Facade: pegar pipoca.\n");
		popcorn.on();
		popcorn.makePopcorn();
		popcorn.putOnButter();
		popcorn.putOnSalt();
	}
	
	public void getSoda() {
		System.out.println("\n==> HomeTheater Facade: pegar refrigerante.\n");
		soda.on();
		soda.getSoda();
		soda.putOnIce();
	}
	
	public void adjustLigth() {
		System.out.println("\n==> HomeTheater Facade: ajustando luz ambiente.\n");
		ambientLigth.decreaseIntensity();
		ambientLigth.changeColor("Azul");
	}
	
	public void shutdown() {
		System.out.println("\n==> HomeTheater Facade: desligando.\n");
		screen.off();
		ambientLigth.off();
	}
}
