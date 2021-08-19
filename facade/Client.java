package design_patterns.padroes.facade;

public class Client {
	public static void main(String args[]) {
		AmbientLight ambientLigth = new AmbientLight("Smart Led");
		Tuner tuner = new Tuner("Kmoon");
		Amplifier amplifier = new Amplifier("Marshall Code", tuner);
		CdPlayer cdPlayer = new CdPlayer("Pionner", amplifier);
		MultimediaProjector projector = new MultimediaProjector("Xiaomi");
		DvdPlayer dvdPlayer = new DvdPlayer("Sony", amplifier, projector);
		PopcornMachine popcorn = new PopcornMachine("Philips Walita");
		ProjectionScreen screen = new ProjectionScreen("Panasonic OLED");
		SodaMachine soda =  new SodaMachine("SodaStream");
		
		HomeTheaterFacade homeTheater = new HomeTheaterFacade(ambientLigth, amplifier, cdPlayer, dvdPlayer, projector, popcorn, screen, soda, tuner);
		
		homeTheater.init();
		homeTheater.adjustLigth();
		homeTheater.getPopcorn();
		homeTheater.getSoda();
		homeTheater.cdPlay("Em ritmo de aventura");
		homeTheater.stopListen();
		homeTheater.dvdPlay("The Hangover");
		homeTheater.stopWatch();
	}
}
