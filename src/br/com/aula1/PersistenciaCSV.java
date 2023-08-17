package br.com.aula1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class PersistenciaCSV {

	public static void main(String[] args) {
		String[] data1 = {"Alice", "Leticia", "Lucas"};
		
		String csvFilePath = "data.csv";
		
		writeDataToCSV(csvFilePath, data1);
	}

	private static void writeDataToCSV(String filePath, String[] data) {
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
			for (String registro : data ) {
				writer.write(registro);
				writer.newLine();
			}
			
			System.out.println("Dados salvos com sucesso!");
			
		} catch (IOException e) {
			e.printStackTrace();
	}

	}
}
	
