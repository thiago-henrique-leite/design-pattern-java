package design_patterns.padroes.composite.publications;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class Magazine extends PublicationElement {

	private String name;

	public Magazine(String name) {
		this.name = name;
		this.publications = new ArrayList<>(); 
	}
	
	public String getName() {
		return name;
	}
	
	public void add(PublicationElement publication) {
		this.publications.add(publication);
	}
	
	public void remove(PublicationElement pub) {
		if(publications.contains(pub)) {
			publications.remove(pub);
		} else {
			throw new NoSuchElementException("Revista não possui este elemento!");
		}
	}
	
	public PublicationElement getChild(int index) {
		return publications.get(index);
	}
	
	public List<PublicationElement> getPublications() {
		return publications;
	}
	
	public int getPublicationsSize() {
		return publications.size();
	}
	
	public String toString() {
		for(PublicationElement pub : publications)
			pub.toString();
		String str = "Revista: " + name + "\n";
		System.out.println(str);
		return str;
	}
}
