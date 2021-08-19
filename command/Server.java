package design_patterns.padroes.command;

import java.util.HashMap;
import java.util.Map;

public class Server {
	
	private PeopleDatabase db = new PeopleDatabase();
	private Map<String, Command> commands = new HashMap<String, Command>();
	
	public Server() {
		initCommands();
	}
	
	public void initCommands() {
		commands.put("new", new NewCommand(db));
		commands.put("delete", new DeleteCommand(db));
		commands.put("all", new GetAllCommand(db));
		commands.put("get", new GetCommand(db));
	}
	
	public void service(String cmd) {
		String arg0, arg1 = "0", arg2 = "";
		
		String[] splittedCmd = cmd.split(" ");
		
		if(splittedCmd.length == 1) {
			arg0 = cmd;
		} else if(splittedCmd.length == 2) {		
			arg0 = splittedCmd[0];
			arg1 = splittedCmd[1];
		} else {
			arg0 = splittedCmd[0];
			arg1 = splittedCmd[1];
			arg2 = splittedCmd[2];
		}
			
		if(commands.containsKey(arg0)) {
			commands.get(arg0).execute(Integer.parseInt(arg1), arg2);
		} else {
			new NullCommand().execute(0, null);
		}
	}
}
