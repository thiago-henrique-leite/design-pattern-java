package design_patterns.padroes.state;

public class EstadoVivo implements Estado {

	@Override
	public void miar() {
		System.out.println("Estado Vivo: Miauuuuuuuuu!");
	}

}
