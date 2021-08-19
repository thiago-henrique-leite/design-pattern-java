package design_patterns.padroes.factory_method;

public class CriadorFactory {
	
	private static ConstrutoresHashMap construtores = new ConstrutoresHashMap();
	
	public static Figura criar(String fig) {
		Builder builder = (Builder) construtores.search(fig);
		
		if(builder == null)
			return null;
			
		return (Figura) builder.build();
	}
}
