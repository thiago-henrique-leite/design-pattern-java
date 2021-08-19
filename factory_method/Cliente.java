package design_patterns.padroes.factory_method;

public class Cliente {
	
	public static void main(String args[]) {
		
		System.out.println(CriadorFactory.criar("circulo").toString());
		System.out.println(CriadorFactory.criar("quadrado").toString());	
		System.out.println(CriadorFactory.criar("triangulo-eq").toString());	
	}
}
