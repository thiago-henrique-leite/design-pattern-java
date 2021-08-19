package design_patterns.padroes.prototype;

public class Ponto implements Produto, Prototipo, Cloneable {
	private int x;
	private int y;
	
	public Ponto(int x, int y) {
		setX(x);
		setY(y);
	}
	
	public void setX(int x) { this.x = x; }
	public void setY(int y) { this.y = y; }
	
	public int getX() { return this.x; }	
	public int getY() { return this.y; }
	
	public String toString() {
		return "(" + this.x + "," + this.y + ")";
	}
	
	@Override
	public void print() {
		System.out.println(this.toString());
	}
	
	public Object clone() {
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			return null;
		}
	}
}
