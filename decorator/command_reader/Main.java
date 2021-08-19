package design_patterns.padroes.decorator.command_reader;

import java.util.Scanner;

public class Main {
	
	@SuppressWarnings("resource")
	public static void main(String args[]) {
		
		Scanner read = new Scanner(System.in);
		
		CommandReader commandReader = new CommandReader();
		
		System.out.println("Comandos Teste:" + "\n");
		
		commandReader.readCommand("new id nome");
		commandReader.readCommand("delete id");
		commandReader.readCommand("get id");
		commandReader.readCommand("all");
		commandReader.readCommand("incorrect command");
		
		System.out.println("\n" + "Insira os comandos desejados abaixo: ");
		
		while(true) {
			System.out.print("$ ");
			commandReader.readCommand(read.nextLine());
		}
	}
}
