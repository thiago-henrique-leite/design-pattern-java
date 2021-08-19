package design_patterns.padroes.proxy;

import java.util.ArrayList;
import java.util.List;

public class BookSearch {
	
	private List<String> books;
	
	public BookSearch() {
		this.books = new ArrayList<>();
	}
	
	public void addBook(String book) {
		this.books.add(book);
	}
	
	public void getBook(String book) {
		if(books.contains(book)) {
			System.out.println("BookSearch#getBook: Livro " + book + " encontrado no acervo!");
			returnBook(book);
		} else {
			System.out.println("BookSearch#getBook: Livro " + book + " não encontrado no acervo!");
		}
	}
	
	public void request(String book) {
		getBook(book);
	}
	
	public void returnBook(String book) {
		System.out.println("BookSearch#returnBook: Retornando livro: " + book + "\n");
	}
}
