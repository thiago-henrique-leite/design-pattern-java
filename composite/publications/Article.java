package design_patterns.padroes.composite.publications;

import java.util.List;

public class Article extends PublicationElement {

	private String name;
	List<String> authors;

	public Article(String name, List<String> authors) {
		this.name = name;
		this.authors = authors;
	}

	public String getName() {
		return name;
	}
	
	public List<String> getAuthors() {
		return authors;
	}
	
	public String takeAuthorsAsString() {
		String authors = "";
		for(String author : this.authors) {
			authors = authors.concat(author + " / ");
		}
		return authors;
	}
	
	public String toString() {
		String str = "Artigo: " + name + "\n" + "\tAutores: " + takeAuthorsAsString() + "\n";
		System.out.println(str);
		return str;
	}
}
