package design_patterns.padroes.state;

public class Gato {
	public final Estado VIVO = new EstadoVivo();
	public final Estado MORTO = new EstadoMorto();
	public final Estado QUANTICO = new EstadoQuantico();
	
	private Estado estado;
	
	public Gato() {
		this.estado = VIVO;
	}
	
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	
	public void miar() {
		estado.miar();
	}
	
	public Gato morrer() {
		this.estado = MORTO;
		
		return this;
	}
	
	public Gato tornarQuantico() {
		this.estado = QUANTICO;
		
		return this;
	}
}
