package design_patterns.padroes.chain_of_responsability;

public class TextFileParser extends Processor {

	public void request(FileText file) {
		System.out.println("TextFileParser#request: Iniciando requisição! \n");
	}
}
