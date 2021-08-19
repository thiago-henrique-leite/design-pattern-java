package design_patterns.padroes.bridge;

public abstract class QueueAbstract {
	
	protected QueueImplementor implementor;
	
	public QueueAbstract(QueueImplementor implementor) {
		this.implementor = implementor;
	}

	abstract Object dequeue();
	abstract void enqueue(Object object);
	abstract boolean isEmpty();
	abstract int size();
	abstract void print();
}