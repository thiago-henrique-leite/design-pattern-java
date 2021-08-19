package design_patterns.padroes.template_method;

import java.io.IOException;

public abstract class TemplateMethodAbstract {
	
	public void generateCode() throws IOException {
		createFile();
		addPackage();
		addLibs();
		addPrincipalClass();
		addVariables();
		addConstructor();
		addMethods();
		writeCodeInFile();
	}
	
	abstract void createFile();
	abstract void addPackage();
	abstract void addLibs();
	abstract void addPrincipalClass();
	abstract void addVariables();
	abstract void addConstructor();
	abstract void addMethods();
	abstract void writeCodeInFile() throws IOException;
}
