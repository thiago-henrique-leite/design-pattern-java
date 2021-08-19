package design_patterns.padroes.factory_method;

public class CirculoBuilder implements Builder {

	private Circulo circulo;
	private float raio;
	
	public CirculoBuilder() {
		// default values
		this.raio = (float) 5.7;
	}
	
	@Override
	public Object build() {
		if(podeConstruir())
			this.circulo = new Circulo(this);
		
		return circulo;
	}
	
	private boolean podeConstruir() {
		return (circulo == null && raio > 0);
	}

	public CirculoBuilder setRaio(float raio) {
		this.raio = raio;
		return this;
	}
	
	public float getRaio() {
		return this.raio;
	}

	@Override
	public Object resultado() {
		return circulo;
	}
}
