package design_patterns.padroes.decorator.command_reader;

import java.io.IOException;
import java.io.Reader;

public class CommandReader extends Reader {
	
	public Command readCommand(String command) {
		System.out.print("Comando: " + command + " - ");
		
		String[] splittedCommand = command.split(" ");
		
		int arguments = splittedCommand.length - 1;
				 
		String firstWordToCommand = splittedCommand[0];
		
		if(firstWordToCommand.equals("new") && arguments > 0)
			return new NewCommand();
		else if(firstWordToCommand.equals("delete") && arguments > 0)
			return new DeleteCommand();
		else if(firstWordToCommand.equals("get") && arguments > 0)
			return new GetCommand();
		else if(firstWordToCommand.equals("all") && arguments == 0)
			return new GetAllCommand();
		else
			return new NullCommand();
	}

	public void close() throws IOException {
		this.close();
	}

	public int read(char[] cbuf, int off, int len) throws IOException {
		return this.read();
	}
}
