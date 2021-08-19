package design_patterns.padroes.proxy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Proxy {
	private List<String> booksCache;
	private BookSearch bookSearch;
	
	public Proxy(BookSearch bookSearch) {
		this.bookSearch = bookSearch;
		this.booksCache = new ArrayList<>();
	}
	
	public void search(String book) {
		System.out.println("\n" + "Executando request do Proxy.." + "\n");
				
		if(bookIsCached(book)) {
			System.out.println("Proxy#search: Livro " + book + " encontrado em cache!");
			System.out.println("Proxy#search: Retornando livro " + book);
		} else {
			System.out.println("Proxy#search: Livro " + book + " não encontrado em cache!");
			this.bookSearch.request(book);
		}
	}
	
	private void addBookInCache(String book) {
		this.booksCache.add(book);
	}

	private boolean bookIsCached(String book) {
		Iterator<String> it = booksCache.iterator();
		
		while(it.hasNext()) 
			if(it.next() == book)
				return true;
		
		addBookInCache(book);
		
		return false;
	}
	
	public void clearCache() {
		booksCache.clear();
	}
}
