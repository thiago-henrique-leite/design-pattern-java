package design_patterns.padroes.chain_of_responsability;

public class PointCounter extends Processor {

	public void request(FileText file) {
		int points = new CountCharacter(file.getFileData(), '.').perform();
		System.out.println("PointCounter#request: Quantidade de pontos no arquivo: " + points + "\n");
	}
}
