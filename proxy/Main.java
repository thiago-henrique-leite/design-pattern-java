package design_patterns.padroes.proxy;

public class Main {
	public static void main(String args[]) {
		
		BookSearch bs = new BookSearch();
		Proxy proxy = new Proxy(bs);
		
		bs.addBook("Odisseia");
		bs.addBook("Clean Code");
		bs.addBook("Mentirosos e Desajustados");
		
		proxy.search("Dom Quixote");
		proxy.search("A Ilha Perdida");
		proxy.search("Odisseia");
		proxy.search("Dom Quixote");
	}
}
