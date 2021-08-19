package design_patterns.padroes.singleton;

public class Main {
	public static void main(String args[]) {
		Tuner t       = new Tuner("Kmoon");
		Soda sod      = new Soda("SodaStream");
		Light al      = new Light("Smart Led");
		Screen scr    = new Screen("Panasonic OLED");
		Amplifier a   = new Amplifier("Marshall Code", t);
		CdPlayer cd   = new CdPlayer("Pionner", a);
		Projector p   = new Projector("Xiaomi");
		Popcorn pop   = new Popcorn("Philips Walita");
		DvdPlayer dvd = new DvdPlayer("Sony", a, p);
		
		HomeTheaterSingleton homeTheater1 = HomeTheaterSingleton.getInstance();
		HomeTheaterSingleton homeTheater2 = HomeTheaterSingleton.getInstance();
		HomeTheaterSingleton homeTheater3 = HomeTheaterSingleton.getInstance();
		
		homeTheater1.init(al, a, cd, dvd, p, pop, scr, sod, t);
		
		if(homeTheater1 == homeTheater2 && homeTheater2 == homeTheater3) {
			System.out.println("Todas instâncias são iguais!");
		}
	
		homeTheater1.start();
	}
}

