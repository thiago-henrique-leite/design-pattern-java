package design_patterns.padroes.abstract_factory;

public class Circulo implements Produto {
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
		return "Círculo - Ponto " + ponto.toString() + " - Raio: " + this.raio + "\n";
	}

	@Override
	public void print() {
		System.out.println(this.toString());
	}
}