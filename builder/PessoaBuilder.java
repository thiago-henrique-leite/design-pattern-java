package design_patterns.padroes.builder;

public class PessoaBuilder extends Builder {

	private Pessoa pessoa;
	private String nome;
	private String identidade;
	
	@Override
	public Pessoa build() {
		if(podeConstruir()) {
			this.pessoa = new Pessoa(this);
			
			System.out.println("Pessoa foi criada com sucesso!");
			return this.pessoa;
		} else {
			System.out.println("");
			
			if(nome == null) 
				System.out.println("Não é possível construir a pessoa, nome faltando!");
			if(identidade == null)
				System.out.println("Não é possível construir a pessoa, identidade faltando!");
			
			return null;
		}
	}
	
	private boolean podeConstruir() {
		return (nome != null && identidade != null);
	}
	
	public PessoaBuilder setNome(String nome) {
		this.nome = nome;
		return this;
	}
	
	public PessoaBuilder setIdentidade(String identidade) {
		this.identidade = identidade;
		return this;
	}
	
	public String getNome() { return this.nome; }
	public String getIdentidade() { return this.identidade; }

	@Override
	public Object resultado() {
		if(pessoa != null) {
			System.out.println(pessoa.toString());
		} else {
			System.out.println("Pessoa ainda não foi criada!");
		}
		
		return pessoa;
	}
}

