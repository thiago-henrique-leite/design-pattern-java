package design_patterns.padroes.builder;

public class EmpresaBuilder extends Builder {

	private PessoaBuilder pessoaBuilder;
	private Empresa empresa;
	private Pessoa responsavel;
	private String nomeResp;
	private String identidadeResp;
	private String nomeEmpresa;
	
	public EmpresaBuilder() {
		pessoaBuilder = new PessoaBuilder();
	}
	
	@Override
	public Empresa build() {
		construirResponsavel();
		
		if(podeConstruir()) {
			this.empresa = new Empresa(this);
			
			System.out.println("Empresa foi criada com sucesso!");
			return this.empresa;
		} else {
			if(nomeEmpresa == null)
				System.out.println("Não é possível construir a empresa, nome da empresa faltando!");
			
			System.out.println("");
			return null;
		}
	}
	
	private void construirResponsavel() {
		if(this.responsavel == null)
			this.responsavel = pessoaBuilder.setNome(nomeResp).setIdentidade(identidadeResp).build();
	}
	
	private boolean podeConstruir() {
		return (responsavel != null && nomeEmpresa != null);
	}
	
	public EmpresaBuilder setNomeResponsavel(String nome) {
		this.nomeResp = nome;
		return this;
	}
	
	public EmpresaBuilder setIdentidadeResponsavel(String identidade) {
		this.identidadeResp = identidade;
		return this;
	}
	
	public EmpresaBuilder setNomeEmpresa(String nome) {
		this.nomeEmpresa = nome;
		return this;
	}
	
	public String getNomeEmpresa() { return this.nomeEmpresa; }
	public Pessoa getResponsavel() { return this.responsavel; }
	
	@Override
	public Object resultado() {
		if(empresa != null) {
			System.out.println(empresa.toString());
		} else {
			System.out.println("Empresa ainda não foi criada!");
		}
		
		return empresa;
	}
}
