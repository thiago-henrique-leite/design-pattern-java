package design_patterns.padroes.bridge;

import java.util.List;
import java.util.ArrayList;

public class ArrayListQueue implements QueueImplementor {
	
	private List<Object> list;
	
	public ArrayListQueue() {
		this.list = new ArrayList<>();
	}

	public Object dequeue() {
		System.out.print("Desenfileirando: ");
		if(!list.isEmpty()) {		
			System.out.println(list.get(0));
			return list.remove(0);
		} else {
			System.out.println("Fila está vazia!");
			return (Object) null;
		}
	}

	public void enqueue(Object object) {
		System.out.println("Enfileirando: " + object);
		list.add(object);
	}

	public boolean isEmpty() {
		System.out.println("ArrayListQueue está vazia? " + list.isEmpty());
		return list.isEmpty();
	}

	public int size() {
		System.out.println("Tamanho da fila: " + list.size());
		return list.size();
	}
	
	public void print() {
		System.out.println("ArrayListQueue: " + list);
	}
}
