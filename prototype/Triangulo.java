package design_patterns.padroes.prototype;

public class Triangulo implements Produto, Prototipo, Cloneable {
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
				        " - PontoC: " + pontoC.toString();
	}
	
	@Override
	public void print() {
		System.out.println(this.toString());
	}
	
	public Object clone() {
		try {
			Triangulo t = (Triangulo) super.clone();
			
			t.setPontoA((Ponto) pontoA.clone());
			t.setPontoB((Ponto) pontoB.clone());
			t.setPontoC((Ponto) pontoC.clone());
			
			return t;
		} catch (CloneNotSupportedException e) {
			return null;
		}
	}
}

