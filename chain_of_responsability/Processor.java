package design_patterns.padroes.chain_of_responsability;

public abstract class Processor {

	protected Processor next;
	
	public FileText processRequest(FileText file) {
		request(file);
		
		if(this.next != null)
			return this.next.processRequest(file);
		
		return file;
	}
	
	public abstract void request(FileText file);
	
	public Processor setNext(Processor next) {
		this.next = next;
		return next;
	}
}
