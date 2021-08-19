package design_patterns.padroes.template_method;

import java.util.*;

@SuppressWarnings("unused")
public class MinhaClasse {
	private String message;

	public MinhaClasse() {
		this.message = "Testando Template Method!";
	}

	public void printMessage() {
		System.out.println("Testando Template Method!");
	}

	public static void main(String args[]) {
		MinhaClasse myclass = new MinhaClasse();

		myclass.printMessage();
	}
}