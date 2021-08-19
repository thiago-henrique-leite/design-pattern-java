package design_patterns.padroes.factory_method;

public class TrianguloEquilateroBuilder implements Builder {

	private TrianguloEquilatero trianguloEquilatero;
	private float lado;
	
	public TrianguloEquilateroBuilder() {
		// default values
		this.lado = 7;
	}
	
	@Override
	public Object build() {
		if(podeConstruir())
			this.trianguloEquilatero = new TrianguloEquilatero(this);
		
		return trianguloEquilatero;
	}
	
	private boolean podeConstruir() {
		return (trianguloEquilatero == null && lado > 0);
	}

	public TrianguloEquilateroBuilder setLado(float lado) {
		this.lado = lado;
		return this;
	}
	
	public float getLado() {
		return this.lado;
	}

	@Override
	public Object resultado() {
		return trianguloEquilatero;
	}
}
