package design_patterns.padroes.composite.publications;

import java.util.List;

public abstract class PublicationElement {
	
	protected List<PublicationElement> publications;
	
	public abstract String getName();
	
	public void add(PublicationElement participant) {};
	
	public void remove(PublicationElement participant) {};

	public PublicationElement getChild(int index) {
		throw new java.lang.UnsupportedOperationException("Método não implementado.");
	}
}
