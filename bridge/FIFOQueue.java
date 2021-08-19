package design_patterns.padroes.bridge;

public class FIFOQueue extends QueueAbstract {

	public FIFOQueue(QueueImplementor implementor) {
		super(implementor);
	}
	
	public Object dequeue() {
		return this.implementor.dequeue();
	}

	public void enqueue(Object object) {
		this.implementor.enqueue(object);
	}

	public boolean isEmpty() {
		return this.implementor.isEmpty();
	}

	public int size() {
		return this.implementor.size();
	}

	void print() {
		this.implementor.print();
	}
}
