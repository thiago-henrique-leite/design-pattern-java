package design_patterns.padroes.abstract_factory;

public class Cliente {
	
	public static void main(String args[]) {
		
		ConcreteFactory factory = new ConcreteFactory();
		
		Ponto pontoA = factory.criarPonto(7, 11);
		Ponto pontoB = factory.criarPonto(18, 4);
		Ponto pontoC = factory.criarPonto(5, 29);
		
		factory.criarCirculo(pontoA, 34).print();;
		factory.criarRetangulo(pontoA, pontoB).print();
		factory.criarTriangulo(pontoA, pontoB, pontoC).print();		
	}
}
