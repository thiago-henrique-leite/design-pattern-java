package design_patterns.padroes.factory_method;

public class QuadradoBuilder implements Builder {

	private Quadrado quadrado;
	private float lado;
	
	public QuadradoBuilder() {
		// default values
		this.lado = 10;
	}
	
	@Override
	public Object build() {
		if(podeConstruir())
			this.quadrado = new Quadrado(this);
		
		return quadrado;
	}
	
	private boolean podeConstruir() {
		return (quadrado == null && lado > 0);
	}

	public QuadradoBuilder setLado(float lado) {
		this.lado = lado;
		return this;
	}
	
	public float getLado() {
		return this.lado;
	}

	@Override
	public Object resultado() {
		return quadrado;
	}
}
