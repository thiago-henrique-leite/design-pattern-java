package design_patterns.padroes.command;

import java.util.Scanner;

public class Client {
	
	public static void main(String args[]) {
		
		@SuppressWarnings("resource")
		Scanner read = new Scanner(System.in);
		
		Server server = new Server();
		
		System.out.println("Entre com os comandos desejados:");
		
		while(true) {
			System.out.print("$ ");
			server.service(read.nextLine());
		}
	}
}
