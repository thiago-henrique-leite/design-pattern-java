package design_patterns.padroes.template_method;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CodeGenerator extends TemplateMethodAbstract {
	
	private File file;
	private StringBuilder builder = new StringBuilder();
	private String className, message;
	
	public CodeGenerator(String className, String message) {
		this.className = className;
		this.message = message;
	}
	
	@Override
	void createFile() {
		file = new File("./design_patterns/padroes/template_method/MinhaClasse.java");
        
        try{
           file.createNewFile();
        }catch(IOException io){
            io.printStackTrace();
        }
	}
	
	@Override
	void addPackage() {
		builder.append("package design_patterns.padroes.template_method;\n\n");
	}
	
	@Override
	void addLibs() {
		builder.append("import java.util.*;\n\n");
	}

	@Override
	void addPrincipalClass() {
		builder.append("@SuppressWarnings(\"unused\")")
			.append("\npublic class " + className + " {");
	}

	@Override
	void addVariables() {
		builder.append("\n\tprivate String message;");
	}

	@Override
	void addConstructor() {
		builder.append("\n\n\tpublic " + className + "() {")
			.append("\n\t\tthis.message = \"" + message + "\";")
			.append("\n\t}");
	}

	@Override
	void addMethods() {
		builder.append("\n\n\tpublic void printMessage() {")
		.append("\n\t\tSystem.out.println(\"" + message + "\");")
		.append("\n\t}")
		.append("\n\n\tpublic static void main(String args[]) {")
		.append("\n\t\t" + className + " myclass = new " + className + "();")
		.append("\n\n\t\tmyclass.printMessage();")
		.append("\n\t}")
		.append("\n}");		
	}
	
	@Override
	void writeCodeInFile() throws IOException {
		FileWriter fw = new FileWriter(file);        
        BufferedWriter bw = new BufferedWriter(fw);
        
        bw.write(builder.toString());
        
		bw.close();
		fw.close();
	}
	
	public void printBuilder() {
		System.out.println(builder);
	}
}
