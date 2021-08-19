package design_patterns.padroes.template_method;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.LinkedList;

public class SortWord implements Comparator<Object> {
	
	private List<String> palavras = new ArrayList<>();
	
	public void addPalavra(String palavra) {
		palavras.add(palavra);
	}

	public int compare(Object word1, Object word2) {
		String w1 = (String) word1;
		String w2 = (String) word2;
		
		int w1Size = w1.toCharArray().length;
		int w2Size = w2.toCharArray().length;
		
		char charW1 = w1.charAt(w1Size - 1);
		char charW2 = w2.charAt(w2Size - 1);
	
		int numC1 = Character.getNumericValue(charW1);
		int numC2 = Character.getNumericValue(charW2);
		
		return (numC1 < numC2) ? 0 : 1;
	}
	
	public void ordenarPalavras() {
		LinkedList<String> palavrasOrd = new LinkedList<>();
		
		for(int i=0; i<palavras.size() - 1; i+=2) {
			if(compare(palavras.get(i), palavras.get(i+1)) == 0) {
				palavrasOrd.addFirst(palavras.get(i));
				palavrasOrd.addLast(palavras.get(i+1));
			} else {
				palavrasOrd.addFirst(palavras.get(i+1));
				palavrasOrd.addLast(palavras.get(i));
			}
		}
		
		System.out.println("Palavras ordenadas:\n");
		
		for(String p : palavrasOrd) {
			System.out.println(p);
		}
	}
	
	public static void main(String args[]) {
		SortWord sw = new SortWord();
		
		sw.addPalavra("agua");
		sw.addPalavra("pombo");
		sw.addPalavra("sucuri");
		sw.addPalavra("cantar");
		
		sw.ordenarPalavras();
	}
}
