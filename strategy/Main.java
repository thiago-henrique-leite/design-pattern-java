package design_patterns.padroes.strategy;

public class Main {
	
	public static void main(String args[]) {
		RotinaEstudo rotina = new RotinaEstudo();
		
		rotina.executarAcao();
		rotina.definirEstrategia();
		rotina.executarAcao();
	}
}
