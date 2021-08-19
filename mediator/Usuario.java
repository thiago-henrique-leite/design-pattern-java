package design_patterns.padroes.mediator;

public class Usuario {
	protected Mediator mediator;
	protected String nome;

	public Usuario(String nome, Mediator mediator) {
		this.nome = nome;
		this.mediator = mediator;
	 }

	public void enviarMensagem(String msg) {
		System.out.println("Usuário " + nome + " enviando mensagem: " + msg);
	    mediator.enviarMensagem(msg, this);
	}

	public void receberMensagem(String msg) {
	    System.out.println("Usuário " + nome + " recebendo mensagem: " + msg);
	}
}