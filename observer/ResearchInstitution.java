package design_patterns.padroes.observer;

// Concrete observer

public class ResearchInstitution extends Observer {

	protected String name;
	
	public ResearchInstitution(String name) {
		this.name = name;
	}
	
	public void update(Observable o) {
		if(o instanceof DataCollectionPlataform) {
			System.out.println("\n" + name + ": Atualização coletada! O último monitoramento detectado foi:");
			((DataCollectionPlataform) o).monitoring();
		}
	}
	
}
