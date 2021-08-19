package design_patterns.padroes.mediator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ChatMediator implements Mediator {
	private List<Usuario> usuarios;

	public ChatMediator() {
		this.usuarios = new ArrayList<>();
	}

	public void adicionarUsuario(Usuario usuario) {
	    this.usuarios.add(usuario);
	}

	public void enviarMensagem(String msg, Usuario usuario) {
		Iterator<Usuario> it = usuarios.iterator();
		
	    while(it.hasNext()) {
	    	Usuario remetente = it.next();

	    	if(usuario != remetente) {
	    		remetente.receberMensagem(msg);
	    	}
	    }
	 }
}