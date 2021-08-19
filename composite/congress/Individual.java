package design_patterns.padroes.composite.congress;

public class Individual extends Participant {
	
	private int seat;
	
	public Individual(String name, int seat) {
		super.name = name;
		this.seat = seat;
	}

	public String getName() {
		return name;
	}
	
	public int getSeat() {
		return seat;
	}
	
	public String toString() {
		return "Indivíduo: " + name + " - Assento: " + seat;
	}

}
