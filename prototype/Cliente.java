package design_patterns.padroes.prototype;

public class Cliente {
	
	public static void main(String args[]) {
		
		ConcreteFactory factory = new ConcreteFactory();
		
		System.out.println("Objetos Originais:" + "\n");
		
		Ponto pontoA = factory.criarPonto(7, 11);
		Ponto pontoB = factory.criarPonto(18, 4);
		Ponto pontoC = factory.criarPonto(5, 29);
		
		Circulo circulo = factory.criarCirculo(pontoA, 34);
		Retangulo retangulo = factory.criarRetangulo(pontoA, pontoB);
		Triangulo triangulo = factory.criarTriangulo(pontoA, pontoB, pontoC);
		
		circulo.print();
		retangulo.print();
		triangulo.print();
		
		System.out.println("\n" + "Objetos Clone:" + "\n");
		
		factory.criarCloneCirculo(circulo).print();
		factory.criarCloneRetangulo(retangulo).print();
		factory.criarCloneTriangulo(triangulo).print();
	}
}
