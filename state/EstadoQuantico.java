package design_patterns.padroes.state;

public class EstadoQuantico implements Estado {

	@Override
	public void miar() {
		System.out.println("Estado Quantico: Olá Humano!");
	}

}
