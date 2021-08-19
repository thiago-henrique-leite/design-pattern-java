package design_patterns.padroes.abstract_factory;

public class ConcreteFactory implements AbstractFactory {

	@Override
	public Ponto criarPonto(int x, int y) {
		return new Ponto(x,y);
	}

	@Override
	public Circulo criarCirculo(Ponto p, int raio) {
		return new Circulo(p, raio);
	}

	@Override
	public Retangulo criarRetangulo(Ponto p1, Ponto p2) {
		return new Retangulo(p1, p2);
	}

	@Override
	public Triangulo criarTriangulo(Ponto p1, Ponto p2, Ponto p3) {
		return new Triangulo(p1, p2, p3);
	}
}
