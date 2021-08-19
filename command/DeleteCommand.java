package design_patterns.padroes.command;

public class DeleteCommand extends Command {

	private PeopleDatabase db;
	
	public DeleteCommand(PeopleDatabase db) {
		this.db = db;
	}

	@Override
	public void execute(int id, String name) {
		db.delete(id);
	}
}
