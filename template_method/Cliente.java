package design_patterns.padroes.template_method;

import java.io.IOException;

public class Cliente {
	
	public static void main(String args[]) throws IOException {
		
		CodeGenerator cg = new CodeGenerator("MinhaClasse", "Testando Template Method!");
		
		cg.generateCode();
		cg.printBuilder();
	}
}
