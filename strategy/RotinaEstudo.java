package design_patterns.padroes.strategy;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class RotinaEstudo {
	
	private Estrategia estrategia;
	
	public void definirEstrategia() {
		GregorianCalendar calendar = new GregorianCalendar();
		
		int diaSemana = calendar.get(Calendar.DAY_OF_WEEK);
		
		if(diaSemana == 0 || diaSemana == 7) {
			estrategia = new EstrategiaFimDeSemana();
		} else if(diaSemana == 2) {
			estrategia = new EstrategiaSegunda();
		} else if(diaSemana == 3) {
			estrategia = new EstrategiaTerca();
		} else if(diaSemana == 4) {
			estrategia = new EstrategiaQuarta();
		} else if(diaSemana == 5) {
			estrategia = new EstrategiaQuinta();
		} else if(diaSemana == 6) {
			estrategia = new EstrategiaSexta();
		}
	}
	
	public void executarAcao() {
		if(estrategia == null) {
			System.out.println("Estratégia ainda não foi definida!\n");
		} else {			
			estrategia.acao();
		}
	}
}
