package design_patterns.padroes.chain_of_responsability;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class File {
	public static String read(String caminho) {
		String conteudo = "";
		
		try {
			FileReader arq = new FileReader(caminho);
			BufferedReader lerArq = new BufferedReader(arq);
						
			try {
				String linha = lerArq.readLine();
				while(linha!=null) {
					conteudo += linha+'\n';
					linha = lerArq.readLine();
				}
				arq.close();
			} catch (IOException e) {
				conteudo = "Erro: Não foi possível ler o arquivo!";
			}
		} catch (FileNotFoundException e) {
			conteudo = "Erro: File não encontrado!";
		}

		return conteudo;
	}
}