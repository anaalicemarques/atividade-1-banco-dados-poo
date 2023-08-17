package br.com.aula1;
import java.io.FileWriter;
import java.io.IOException;

public class PersitenciaTexto {

	public static void main(String[] args) {
		String conteudo = "Este e um exemplo de persitencia em arquivos de texto";
		
		try {
			FileWriter escritor = new FileWriter("arquivo.txt");
			escritor.write(conteudo);
			escritor.close();
			System.out.println("Dados gravados com sucesso!");
		} catch (IOException e) {
			System.err.println("Erro ao escrever no arquivo: " + e.getMessage());
		}

	}

}
