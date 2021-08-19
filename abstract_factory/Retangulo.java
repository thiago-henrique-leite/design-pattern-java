package design_patterns.padroes.abstract_factory;

public class Retangulo implements Produto {
	private Ponto pontoA;
	private Ponto pontoB;
	
	public Retangulo(Ponto pontoA, Ponto pontoB) {
		setPontoA(pontoA);
		setPontoB(pontoB);
	}
	
	public void setPontoA(Ponto ponto) {
		this.pontoA = ponto;
	}
	
	public Ponto getPontoA() {
		return this.pontoA;
	}
	
	public void setPontoB(Ponto ponto) {
		this.pontoB = ponto;
	}
	
	public Ponto getPontoB() {
		return this.pontoB;
	}
	
	public String toString() {
		return "Retângulo - PontoA: " + pontoA.toString() + " - PontoB: " + pontoB.toString() + "\n";
	}
	
	@Override
	public void print() {
		System.out.println(this.toString());
	}
}

