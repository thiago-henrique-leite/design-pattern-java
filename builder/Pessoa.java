package design_patterns.padroes.builder;

public class Pessoa {

	private String nome;
	private String identidade;
	
	public Pessoa(PessoaBuilder pessoaBuilder) {
		setNome(pessoaBuilder.getNome());
		setIdentidade(pessoaBuilder.getIdentidade());
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setIdentidade(String identidade) {
		this.identidade = identidade;
	}
	
	public String getNome() { return this.nome; }
	public String getIdentidade() { return this.identidade; }
	
	public String toString() {
		return "Pessoa: " + nome + " - Identidade: " + identidade;
	}
}
