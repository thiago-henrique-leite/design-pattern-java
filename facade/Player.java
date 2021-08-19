package design_patterns.padroes.facade;

public abstract class Player {
	abstract void on();
	abstract void off();
	abstract void play();
	abstract void pause();
	abstract void stop();
	abstract void insert(String cd);
	abstract void eject();
}
