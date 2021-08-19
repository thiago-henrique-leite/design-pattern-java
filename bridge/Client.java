package design_patterns.padroes.bridge;

public class Client {
	
	public static void main(String args[]) {

		FIFOQueue fifoVector = new FIFOQueue(new VectorQueue());
		FIFOQueue fifoArrayList = new FIFOQueue(new ArrayListQueue());
		
		System.out.println("FifoQueue with Vector:\n");
		
		fifoVector.enqueue(1);
		fifoVector.enqueue("String");
		fifoVector.enqueue(5.9);
		fifoVector.enqueue(7829);
		fifoVector.enqueue("Teste");
		fifoVector.size();
		fifoVector.dequeue();
		fifoVector.dequeue();
		fifoVector.isEmpty();
		fifoVector.size();
		fifoVector.print();
		
		System.out.println();
		
		System.out.println("FifoQueue with ArrayList:\n");
		
		fifoArrayList.enqueue(2819);
		fifoArrayList.enqueue("Unifesp");
		fifoArrayList.enqueue("Bridge");
		fifoArrayList.size();
		fifoArrayList.dequeue();
		fifoArrayList.dequeue();
		fifoArrayList.dequeue();
		fifoArrayList.size();
		fifoArrayList.isEmpty();
		fifoArrayList.dequeue();
		fifoArrayList.print();
	}
}
