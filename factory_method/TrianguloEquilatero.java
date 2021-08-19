package design_patterns.padroes.factory_method;

import java.text.DecimalFormat;
import java.lang.String;

public class TrianguloEquilatero implements Figura {

	private float lado;
	
	public TrianguloEquilatero(TrianguloEquilateroBuilder builder) {
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
		return (float) arredondar((Math.pow(lado, 2) * Math.sqrt(3) / 4));
	}
	
	private float arredondar(double valor) {
		DecimalFormat df = new DecimalFormat("#.##");
		return Float.parseFloat(df.format(valor).replace(",", "."));
	}
	
	public String toString() {
		return "Triângulo Equilátero - Lado: " + this.lado + " - Área: " + area() + "\n";
	}
}
