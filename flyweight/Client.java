package design_patterns.padroes.flyweight;

public class Client {
	
	public static void main(String args[]) {
		
		System.out.println("\n" + "Gerando 10 números de 10 algarismos:" + "\n");
		NumberFactory.generateNumbers();
		System.out.println("\n" + "Quantidade de instâncias criadas = " + NumberFlyweight.getAmountInstances());
	}
}
