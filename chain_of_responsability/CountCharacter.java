package design_patterns.padroes.chain_of_responsability;

public class CountCharacter {
	
	private String arq;
	private char c;
	
	public CountCharacter(String arq, char c) {
		this.arq = arq;
		this.c = c;
	}
	
	public int perform() {
		int counter = 0;
		
		this.arq = arq.toLowerCase();
		
		for(int i=0; i<arq.chars().count(); i++) 
			if(arq.charAt(i) == c) 
				counter++;
	
		return counter;
	}
}
