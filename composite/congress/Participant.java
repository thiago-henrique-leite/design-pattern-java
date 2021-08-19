package design_patterns.padroes.composite.congress;

import java.util.List;

public abstract class Participant {
	
	protected String name;
	
	protected List<Participant> participants;
	
	public abstract String getName();

	public void add(Participant participant) {};
	
	public void remove(Participant participant) {};

	public Participant getChild(int index) {
		throw new java.lang.UnsupportedOperationException("Método não implementado.");
	};	
	
	public void print() {
		System.out.println(this.toString());
	}
}