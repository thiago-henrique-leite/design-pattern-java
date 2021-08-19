package design_patterns.padroes.strategy;

public class EstrategiaFimDeSemana implements Estrategia {

	@Override
	public void acao() {
		System.out.println("Fim de Semana: Hoje é dia de descansar!");
	}

}
