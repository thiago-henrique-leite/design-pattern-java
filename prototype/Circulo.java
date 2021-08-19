package design_patterns.padroes.prototype;

public class Circulo implements Produto, Prototipo, Cloneable {
	private Ponto ponto;
	private float raio;
	
	public Circulo(Ponto ponto, float raio) {
		setRaio(raio);
		setPonto(ponto);
	}
	
	public void setRaio(float raio) {
		this.raio = raio;
	}
	
	public float getRaio() {
		return this.raio;
	}
	
	public Ponto getPonto() {
		return ponto;
	}

	public void setPonto(Ponto ponto) {
		this.ponto = ponto;
	}

	public String toString() {
		return "Círculo - Ponto " + ponto.toString() + " - Raio: " + this.raio;
	}

	@Override
	public void print() {
		System.out.println(this.toString());
	}
	
	public Object clone() {
		try {
			Circulo c = (Circulo) super.clone();
			
			c.setPonto((Ponto) ponto.clone());
			
			return c;
		} catch (CloneNotSupportedException e) {
			return null;
		}
	}
}