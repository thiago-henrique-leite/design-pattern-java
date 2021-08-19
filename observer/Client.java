package design_patterns.padroes.observer;

import java.util.Scanner;

public class Client {
	public static void main(String args[]) {
		
		Scanner read = new Scanner(System.in);
		
		ResearchInstitution r1 = new ResearchInstitution("Instituição 01");
		ResearchInstitution r2 = new ResearchInstitution("Instituição 02");
		ResearchInstitution r3 = new ResearchInstitution("Instituição 03");
		
		DataCollectionPlataform dcp = new DataCollectionPlataform();
		
		dcp.subscribe(r1);
		dcp.subscribe(r2);
		dcp.subscribe(r3);
		
		System.out.print("Nova temperatura: ");
		dcp.setTemperature(read.nextFloat());
		
		dcp.unsubscribe(r1);
		
		System.out.print("Novo PH da água: ");
		dcp.setWaterPh(read.nextFloat());
		
		dcp.unsubscribe(r2);
		
		System.out.print("Nova pressão atmosférica: ");
		dcp.setAtmosphericPressure(read.nextFloat());
		
		read.close();
	}
}
