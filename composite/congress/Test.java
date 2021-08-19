package design_patterns.padroes.composite.congress;

public class Test {
	public static void main(String args[]) {
		Institution ies0 = new Institution("Unifesp");
		Institution ies1 = new Institution("Unicamp");
		
		Individual ind0 = new Individual("Isabelly", 1);
		Individual ind1 = new Individual("Henrique", 2);
		Individual ind2 = new Individual("Roberta ", 3);
		Individual ind3 = new Individual("Carlos  ", 4);
		Individual ind4 = new Individual("Silmara ", 5);
		Individual ind5 = new Individual("Miguel  ", 6);
		Individual ind6 = new Individual("Tatiana ", 7);
		Individual ind7 = new Individual("Samuel  ", 8);
		Individual ind8 = new Individual("Gabriela", 9);
		Individual ind9 = new Individual("Fernanda", 10);
		
		ies0.add(ind0);
		ies0.add(ind1);
		ies0.add(ind2);
		ies0.add(ind3);
		ies0.add(ind4);
		
		ies1.add(ind5);
		ies1.add(ind6);
		ies1.add(ind7);
		
		Congress congress = new Congress("Ciência e Tecnologia", 10);
		
		congress.add(ies0);
		congress.add(ies1);
		congress.add(ind8);
		congress.add(ind9);
		
		congress.printCongressParticipants();
		
		System.out.println("Filho de índice 2 da Institutição " + ies1.getName());
		System.out.println("\t" + ies1.getChild(2).toString() + "\n");
		
		System.out.println("Removendo membro " + ind0.getName() + " da Institutição: " + ies0.getName() + "\n");
		ies0.remove(ind0);
		ies0.print();
		
		/*
		 Saída obtida:
		 
		 	Congresso Ciência e Tecnologia - Capacidade: 10 participantes.

			Instituição: Unifesp - 5 membros.
				Indivíduo: Isabelly - Assento: 1
				Indivíduo: Henrique - Assento: 2
				Indivíduo: Roberta  - Assento: 3
				Indivíduo: Carlos   - Assento: 4
				Indivíduo: Silmara  - Assento: 5
			
			
			Instituição: Unicamp - 3 membros.
				Indivíduo: Miguel   - Assento: 6
				Indivíduo: Tatiana  - Assento: 7
				Indivíduo: Samuel   - Assento: 8
			
			
			Indivíduo: Gabriela - Assento: 9
			
			Indivíduo: Fernanda - Assento: 10
			
			Filho de índice 2 da Institutição Unicamp
				Indivíduo: Samuel   - Assento: 8
			
			Removendo membro Isabelly da Institutição: Unifesp
			
			Instituição: Unifesp - 4 membros.
				Indivíduo: Henrique - Assento: 2
				Indivíduo: Roberta  - Assento: 3
				Indivíduo: Carlos   - Assento: 4
				Indivíduo: Silmara  - Assento: 5
		 */
	}
}
