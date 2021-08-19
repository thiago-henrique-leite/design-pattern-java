package design_patterns.padroes.prototype;

public class Retangulo implements Produto, Prototipo, Cloneable {
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
		return "Retângulo - PontoA: " + pontoA.toString() + " - PontoB: " + pontoB.toString();
	}
	
	@Override
	public void print() {
		System.out.println(this.toString());
	}
	
	public Object clone() {
		try {
			Retangulo r = (Retangulo) super.clone();
			
			r.setPontoA((Ponto) pontoA.clone());
			r.setPontoB((Ponto) pontoB.clone());
			
			return r;
		} catch (CloneNotSupportedException e) {
			return null;
		}
	}
}

