package design_patterns.padroes.observer;

import java.util.ArrayList;

public abstract class Observable {
	
	protected ArrayList<Observer> observers = new ArrayList<>();
	
	public void subscribe(Observer o) {
		observers.add(o);
	}

	public void unsubscribe(Observer o) {
		if(observers.contains(o)) {
			observers.remove(o);
		}
	}

	public void notifyObservers() {		
		for(Observer obs : observers) {
			obs.update(this);
		}
	}
}
