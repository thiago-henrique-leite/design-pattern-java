package design_patterns.padroes.decorator.command_reader;

public class CommandReaderDecorator {
	
	CommandReader commandReader;
	
	public CommandReaderDecorator(CommandReader commandReader) {
		this.commandReader = commandReader;
	}
	
	public Command readCommand(String command) {
		return this.commandReader.readCommand(command);
	}
}
