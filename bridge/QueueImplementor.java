package design_patterns.padroes.bridge;

public interface QueueImplementor {
	
	public abstract Object dequeue();
	public abstract void enqueue(Object object);
	public abstract boolean isEmpty();
	public abstract int size();
	public abstract void print();
}
