package design_patterns.padroes.chain_of_responsability;

public class LetterACounter extends Processor {
	
	public void request(FileText file) {
		int a = new CountCharacter(file.getFileData(), 'a').perform();
		System.out.println("LetterACounter#request: Quantidade de letras 'a' no arquivo: " + a + "\n");
	}
}
