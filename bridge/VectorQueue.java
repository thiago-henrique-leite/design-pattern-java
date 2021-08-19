package design_patterns.padroes.bridge;

import java.util.List;
import java.util.Vector;

public class VectorQueue implements QueueImplementor {
	
	private List<Object> vector;
	
	public VectorQueue() {
		this.vector = new Vector<>();
	}

	public Object dequeue() {
		System.out.print("Desenfileirando: ");
		if(!vector.isEmpty()) {		
			System.out.println(vector.get(0));
			return vector.remove(0);
		} else {
			System.out.println("Fila está vazia!");
			return (Object) null;
		}
	}

	public void enqueue(Object object) {
		System.out.println("Enfileirando: " + object);
		vector.add(object);
	}

	public boolean isEmpty() {
		System.out.println("VectorQueue está vazia? " + vector.isEmpty());
		return vector.isEmpty();
	}

	public int size() {
		System.out.println("Tamanho da fila: " + vector.size());
		return vector.size();
	}
	
	public void print() {
		System.out.println("VectorQueue: " + vector);
	}
}
