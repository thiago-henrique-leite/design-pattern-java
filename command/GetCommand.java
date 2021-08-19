package design_patterns.padroes.command;

public class GetCommand extends Command {
	
	private PeopleDatabase db;
	
	public GetCommand(PeopleDatabase db) {
		this.db = db;
	}

	@Override
	public void execute(int id, String name) {
		db.search(id);
	}
}
