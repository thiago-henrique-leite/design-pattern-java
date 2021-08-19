package design_patterns.padroes.mediator;

public interface Mediator {
	public void enviarMensagem(String msg, Usuario usuario);
	public void adicionarUsuario(Usuario usuario);
}