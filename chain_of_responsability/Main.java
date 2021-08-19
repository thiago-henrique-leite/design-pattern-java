package design_patterns.padroes.chain_of_responsability;

public class Main {
	
	public static void main(String args[]) {

		FileText file = new FileText("/home/thiagoleite/texto.txt");
				
		TextFileParser fileParser = new TextFileParser();
		
		fileParser.setNext(new SpaceCounter()).setNext(new LetterACounter()).setNext(new PointCounter());
		
		fileParser.processRequest(file);
	}
}
