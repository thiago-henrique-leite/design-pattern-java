package design_patterns.padroes.chain_of_responsability;

public class FileText {
	private String fileData;
	
	public FileText(String filePath) {
		setFileData(filePath);
	}
	
	private void setFileData(String filePath) {
		this.fileData = File.read(filePath);
	}
	
	public String getFileData() {
		return this.fileData;
	}
}
