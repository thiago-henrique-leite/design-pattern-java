package design_patterns.padroes.command;

public class GetAllCommand extends Command {
	
	private PeopleDatabase db;
	
	public GetAllCommand(PeopleDatabase db) {
		this.db = db;
	}

	@Override
	public void execute(int id, String name) {
		db.getPeoples();
	}
}
