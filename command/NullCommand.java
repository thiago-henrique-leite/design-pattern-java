package design_patterns.padroes.command;

public class NullCommand extends Command {

	@Override
	public void execute(int id, String name) {
		System.out.println("Comando inválido!");
	}
}
