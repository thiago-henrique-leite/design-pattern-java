package design_patterns.padroes.state;

public class EstadoMorto implements Estado {

	@Override
	public void miar() {
		System.out.println("Estado Morto: RIP! Aqui viveu um gato feliz.");
	}

}
