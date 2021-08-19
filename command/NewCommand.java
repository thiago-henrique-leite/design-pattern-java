package design_patterns.padroes.command;

public class NewCommand extends Command {

	private PeopleDatabase db;
	
	public NewCommand(PeopleDatabase db) {
		this.db = db;
	}

	@Override
	public void execute(int id, String name) {
		db.add(id, name);
	}
}
