package design_patterns.padroes.factory_method;

import java.util.HashMap;
import java.util.Map;

public class ConstrutoresHashMap {
	
	private Map<String, Builder> construtores = new HashMap<>();
	
	public ConstrutoresHashMap() {
		initialize();
	}
	
	public void addFigura(String fig, Builder builder) {
		this.construtores.put(fig, builder);
	}
	
	public void initialize() {
		this.construtores.put("circulo", new CirculoBuilder());
		this.construtores.put("triangulo-eq", new TrianguloEquilateroBuilder());
		this.construtores.put("quadrado", new QuadradoBuilder());
	}
	
	public Builder search(String fig) {
		if(construtores.containsKey(fig)) {
			return construtores.get(fig);
		} else {
			System.out.println("Figura não encontrada!");
			return null;
		}
	}
}
