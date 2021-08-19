package design_patterns.padroes.abstract_factory;

public class Triangulo implements Produto {
	private Ponto pontoA;
	private Ponto pontoB;
	private Ponto pontoC;
	
	public Triangulo(Ponto pontoA, Ponto pontoB, Ponto pontoC) {
		setPontoA(pontoA);
		setPontoB(pontoB);
		setPontoC(pontoC);
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
	
	public void setPontoC(Ponto ponto) {
		this.pontoC = ponto;
	}
	
	public Ponto getPontoC() {
		return this.pontoC;
	}
	public String toString() {
		return "Triângulo - PontoA: " + pontoA.toString() + 
				        " - PontoB: " + pontoB.toString() + 
				        " - PontoC: " + pontoC.toString() + "\n";
	}
	
	@Override
	public void print() {
		System.out.println(this.toString());
	}
}

