package design_patterns.padroes.builder;

public class Empresa {
	
	private Pessoa responsavel;
	private String nome;
	
	public Empresa(EmpresaBuilder empresaBuilder) {
		setNome(empresaBuilder.getNomeEmpresa());
		setResponsavel(empresaBuilder.getResponsavel());
	}

	public Pessoa getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(Pessoa responsavel) {
		this.responsavel = responsavel;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String toString() {
		return "\n" + "Empresa: " + nome + " - Responsável -> " + responsavel.toString();
	}
}
