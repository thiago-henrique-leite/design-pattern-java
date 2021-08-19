package design_patterns.padroes.mediator;

public class Main {

	public static void main(String args[]) {
		ChatMediator mediator = new ChatMediator();
	    
		Usuario usr1 = new Usuario("João", mediator);
		mediator.adicionarUsuario(usr1);
		
		Usuario usr2 = new Usuario("José", mediator);
		mediator.adicionarUsuario(usr2);
		
		Usuario usr3 = new Usuario("Maria", mediator);
		mediator.adicionarUsuario(usr3);
		
		Usuario usr4 = new Usuario("Ana", mediator);
		mediator.adicionarUsuario(usr4);
		
		Usuario usr5 = new Usuario("Isabelly", mediator);
		mediator.adicionarUsuario(usr5);

		usr1.enviarMensagem("Olá!");
		usr2.enviarMensagem("Eaí");
	}
}
