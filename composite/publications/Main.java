package design_patterns.padroes.composite.publications;

import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String args[]) {
		// Executando exemplo do slide 31 da Aula Padrões de Projeto B
		
		List<String> authors1 = Arrays.asList("Autor 1", "Autor 2", "Autor 3");
		List<String> authors2 = Arrays.asList("Autor 4", "Autor 5", "Autor 6");
		List<String> authors3 = Arrays.asList("Autor 7", "Autor 8", "Autor 9");
		
		Journal journal = new Journal("Jornal 01");
		
		Article article1 = new Article("Artigo 01", authors1);
		Article article2 = new Article("Artigo 02", authors2);
		Article article3 = new Article("Artigo 03", authors3);
		
		Notebook notebook = new Notebook("Caderno 01");
		
		Magazine magazine = new Magazine("Revista 01");
		
		journal.add(article1);
		journal.add(notebook);
		
		notebook.add(article2);
		notebook.add(magazine);
		
		magazine.add(article3);
		
		// Imprime todas as publicações filhas deste jornal
		journal.toString();
		
		/*
		Saída obtida (vamos imprimir a árvore de baixo para cima):
		
		Artigo: Artigo 01
			Autores: Autor 1 / Autor 2 / Autor 3 / 
	
		Artigo: Artigo 02
			Autores: Autor 4 / Autor 5 / Autor 6 / 
		
		Artigo: Artigo 03
			Autores: Autor 7 / Autor 8 / Autor 9 / 
		
		Revista: Revista 01
		
		Caderno: Caderno 01
		
		Jornal: Jornal 01 
		*/
	}
}
