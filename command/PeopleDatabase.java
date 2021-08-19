package design_patterns.padroes.command;

import java.util.Map;
import java.util.HashMap;

public class PeopleDatabase {
	
	private Map<Integer,String> peoples = new HashMap<Integer,String>();

	public void add(int id, String name) {
		this.peoples.put(id, name);
	}
	
	public void delete(int id) {
		this.peoples.remove(id);
	}
	
	public void search(int id) {
		if(peoples.containsKey(id))
			System.out.println(peoples.get(id).toString());
		else 
			System.out.println("Pessoa não encontrada!");
	}
	
	public void getPeoples() {
		System.out.println(this.peoples);
	}
}
