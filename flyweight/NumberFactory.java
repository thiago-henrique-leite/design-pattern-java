package design_patterns.padroes.flyweight;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class NumberFactory {

	private static Map<Character, NumberFlyweight> flyweight = new HashMap<>();
	private static String algarisms = "0123456789";
	
	public static NumberFlyweight getFlyweight(char c) {
		NumberFlyweight algarismFLW = null;
		
		if(flyweight.get(c) == null) {
			algarismFLW = new NumberFlyweight(c);
			flyweight.put(c,  algarismFLW);
		} else {
			algarismFLW = flyweight.get(c);
		}
		
		return algarismFLW;
	}
	
	public static void generateNumbers() {
		Random random = new Random();
		
		int index = 0;
		
		for(int i=0; i<10; i++) {
			for(int j=0; j<10; j++) {
			 index = random.nextInt(10);
			 getFlyweight(algarisms.charAt(index)).print();
			}
			
			System.out.println("");
		}
	}
}
