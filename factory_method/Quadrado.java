package design_patterns.padroes.factory_method;

import java.text.DecimalFormat;

public class Quadrado implements Figura {

	private float lado;
	
	public Quadrado(QuadradoBuilder builder) {
		setLado(builder.getLado());
	}
	
	public void setLado(float lado) {
		this.lado = lado;
	}
	
	public float getLado() {
		return this.lado;
	}

	@Override
	public float area() {
		return (float) arredondar(Math.round(Math.pow(lado, 2)));
	}
	
	private float arredondar(double valor) {
		DecimalFormat df = new DecimalFormat("#.##");
		return Float.parseFloat(df.format(valor).replace(",", "."));
	}
	
	public String toString() {
		return "Quadrado - Lado: " + this.lado + " - Área: " + area() + "\n";
	}
}
