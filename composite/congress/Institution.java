package design_patterns.padroes.composite.congress;

import java.util.*;

public class Institution extends Participant {
	
	public Institution(String name) {
		super.name = name;
		this.participants = new ArrayList<>();
	}
	
	public String getName() {
		return name;
	}

	public List<Participant> getMembers() {
		return participants;
	}
	
	public int getTotalMembers() {
		return participants.size();
	}
	
	public void add(Participant member) {
		this.participants.add(member);
	}
	
	public void remove(Participant member) {
		if(participants.contains(member)) {
			participants.remove(member);
		}
		else {
			throw new NoSuchElementException("Instituição não possui este elemento!");
		}
	}
	
	public Participant getChild(int index) {
		return participants.get(index);
	}
	
	public String toString() {
		return "Instituição: " + name + " - " + participants.size() + " membros.";
	}
	
	public void print() {
		printMembers();
	}
	
	public void printMembers() {
		System.out.println(this.toString());
		for(Participant ind : this.participants) {
			System.out.print("\t");
			ind.print();
		}
		System.out.println();
	}	
}
