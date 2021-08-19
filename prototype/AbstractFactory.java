package design_patterns.padroes.prototype;

public interface AbstractFactory {
	public Ponto criarPonto(int x, int y);
	public Circulo criarCirculo(Ponto p, int raio);
	public Retangulo criarRetangulo(Ponto p1, Ponto p2);
	public Triangulo criarTriangulo(Ponto p1, Ponto p2, Ponto p3);
}
