package design_patterns.padroes.builder;

public class Cliente {
	
	public static void main(String args[]) {
		
		PessoaBuilder pessoaBuilder = new PessoaBuilder();
		EmpresaBuilder empresaBuilder = new EmpresaBuilder();
		
		pessoaBuilder.build();
		pessoaBuilder.setNome("João").setIdentidade("98.327.324-2").build();
		
		empresaBuilder.build();
		empresaBuilder.setNomeResponsavel("Artenio").setIdentidadeResponsavel("12.345.645-2").build();
		empresaBuilder.setNomeEmpresa("Tech a Tech").build();
		
		empresaBuilder.resultado();
		pessoaBuilder.resultado();
	}
}
