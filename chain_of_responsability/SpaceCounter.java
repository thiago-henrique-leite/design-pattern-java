package design_patterns.padroes.chain_of_responsability;

public class SpaceCounter extends Processor {

	public void request(FileText file) {
		int spaces = new CountCharacter(file.getFileData(), ' ').perform();
		System.out.println("SpaceCounter#request: Quantidade de espaços no arquivo: " + spaces + "\n");
	}
}
