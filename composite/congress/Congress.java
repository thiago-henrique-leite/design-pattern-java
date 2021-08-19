package design_patterns.padroes.composite.congress;

import java.util.*;

public class Congress {
	
	private List<Participant> participants;

	private int totalSeats, freeSeats;
	
	private String name;
	
	public Congress(String name, int totalSeats) {
		setName(name);
		setTotalSeats(totalSeats);
		setFreeSeats(totalSeats);
		initParticipants();
	}

	private void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	private void setTotalSeats(int totalSeats) {
		this.totalSeats = totalSeats;
	}
	
	private void setFreeSeats(int totalSeats2) {
		this.freeSeats = totalSeats;
	}
	
	public int getTotalSeats() {
		return totalSeats;
	}
	
	public int getTotalParticipants() {
		return participants.size();
	}
	
	private void initParticipants() {
		participants = new ArrayList<Participant>();
	}
	
	public List<Participant> getParticipants() {
		return participants;
	}
	
	public void add(Participant p) {
		if(p instanceof Institution)
			addInstitution((Institution) p);
		else if(p instanceof Individual)
			addIndividual((Individual) p);
		else
			throw new UnsupportedOperationException("Tipo de participante inválido!");
	}
	
	private void addInstitution(Institution institution) {
		if(freeSeats >= institution.getTotalMembers()) {
			participants.add(institution);
			freeSeats -= institution.getTotalMembers();
		} else {
			throw new UnsupportedOperationException("Não há assentos suficientes para comportar os membros da Instituição!");
		}
	}
	
	private void addIndividual(Individual individual) {
		if(freeSeats > 0) {
			participants.add(individual);
			freeSeats -= 1;
		} else {
			throw new UnsupportedOperationException("Congresso já está cheio! Não há mais vagas.");
		}
	}
	
	public void printCongressParticipants() {
		System.out.println(this.toString() + "\n");
		for(Participant p : participants) {
			if(p instanceof Individual) {
				p.print();
			} else {
				p.toString();
				p.print();
			}
			System.out.println();
		}
	}
	
	public String toString() {
		return "Congresso " + name + " - Capacidade: " + totalSeats + " participantes.";
	}
}
