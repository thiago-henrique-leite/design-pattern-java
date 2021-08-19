package design_patterns.padroes.singleton;

public class HomeTheaterSingleton {
	
	Light ambientLigth;
	Amplifier amplifier;
	CdPlayer cdPlayer;
	DvdPlayer dvdPlayer;
	Projector projector;
	Popcorn popcorn;
	Screen screen;
	Soda soda;
	Tuner tuner;
	
	static HomeTheaterSingleton instance = null;
	
	private HomeTheaterSingleton() {};
	
	public synchronized static HomeTheaterSingleton getInstance()
	{
		if(instance == null) {
			instance = new HomeTheaterSingleton();
		}
		return instance;
	}
	
	public void init(Light al,
					 Amplifier amp,
					 CdPlayer cd,
					 DvdPlayer dvd,
					 Projector proj,
					 Popcorn popc,
					 Screen scr,
					 Soda sod,
					 Tuner tun) 
	{
			this.ambientLigth = al;
			this.amplifier = amp;
			this.cdPlayer = cd;
			this.dvdPlayer = dvd;
			this.projector = proj;
			this.popcorn = popc;
			this.screen = scr;
			this.soda = sod;
			this.tuner = tun;
	}

	
	public void start() {
		System.out.println("\n==> HomeTheater Singleton: iniciando.\n");
		screen.on();
		ambientLigth.on();
	}
	
	public void dvdPlay(String dvd) {
		System.out.println("\n==> HomeTheater Singleton: assistir dvd.\n");
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
		System.out.println("\n==> HomeTheater Singleton: escutar cd.\n");
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
		System.out.println("\n==> HomeTheater Singleton: parar de assistir.\n");
		dvdPlayer.stop();
		dvdPlayer.eject();
		dvdPlayer.off();
		amplifier.off();
		tuner.off();
		projector.off();
		screen.putOnStandBy();
	}
	
	public void stopListen() {
		System.out.println("\n==> HomeTheater Singleton: parar de ouvir.\n");
		cdPlayer.eject();
		cdPlayer.off();
		amplifier.off();
		tuner.off();
	}
	
	public void getPopcorn() {
		System.out.println("\n==> HomeTheater Singleton: pegar pipoca.\n");
		popcorn.on();
		popcorn.makePopcorn();
		popcorn.putOnButter();
		popcorn.putOnSalt();
	}
	
	public void getSoda() {
		System.out.println("\n==> HomeTheater Singleton: pegar refrigerante.\n");
		soda.on();
		soda.getSoda();
		soda.putOnIce();
	}
	
	public void adjustLigth() {
		System.out.println("\n==> HomeTheater Singleton: ajustando luz ambiente.\n");
		ambientLigth.decreaseIntensity();
		ambientLigth.changeColor("Azul");
	}
	
	public void shutdown() {
		System.out.println("\n==> HomeTheater Singleton: desligando.\n");
		screen.off();
		ambientLigth.off();
	}
}
