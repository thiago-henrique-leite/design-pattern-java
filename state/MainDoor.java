package design_patterns.padroes.state;

public class MainDoor {
	public static void main(String args[]) {
		Door door = new Door();
		
		door.click();
		door.open().click();
	}
}
