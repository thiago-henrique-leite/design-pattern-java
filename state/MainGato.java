package design_patterns.padroes.state;

public class MainGato {
	
	public static void main(String args[]) {
		Gato gato = new Gato();
		
		gato.miar();
		gato.tornarQuantico().miar();
		gato.morrer().miar();
	}
}
