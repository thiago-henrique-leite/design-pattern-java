package design_patterns.padroes.factory_method;

import java.text.DecimalFormat;

public class Circulo implements Figura {
	
	private float raio;
	
	public Circulo(CirculoBuilder builder) {
		setRaio(builder.getRaio());
	}
	
	public void setRaio(float raio) {
		this.raio = raio;
	}
	
	public float getRaio() {
		return this.raio;
	}

	@Override
	public float area() {
		return (float)  arredondar(Math.PI * Math.pow(raio, 2));
	}
	
	private float arredondar(double valor) {
		DecimalFormat df = new DecimalFormat("#.##");
		return Float.parseFloat(df.format(valor).replace(",", "."));
	}
	
	public String toString() {
		return "Círculo - Raio: " + this.raio + " - Área: " + area() + "\n";
	}
}
