package design_patterns.padroes.flyweight;

public class NumberFlyweight extends Flyweight {

	private char c;
	private static int counterInstances = 0;
	
	NumberFlyweight(char c) {
		this.c = c;
		counterInstances++;
	}
	
	public void print() {	
		System.out.print(c);
	}

	public static int getAmountInstances() {
		return counterInstances;
	}
	
	public char getC() {
		return this.c;
	}
}
