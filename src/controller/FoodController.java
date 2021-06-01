package controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class FoodController implements IFoodController {
	
	@Override
	public void readFile(String path, String nome) throws IOException {
		String [] separador;
		File arq = new File(path, nome);
		if(arq.exists() && arq.isFile()) {
			FileInputStream fluxo = new FileInputStream(arq);
			InputStreamReader leitor = new InputStreamReader(fluxo);
			BufferedReader buffer = new BufferedReader(leitor);
			String linha = buffer.readLine();
			while(linha != null) {
				if(linha.contains("Fruits")) {
					separador = linha.split(",");
					for(String palavra: separador) {
						System.out.print(palavra+ "\t");
					}
					System.out.println("");
				}
				linha = buffer.readLine();
			}
			buffer.close();
			leitor.close();
			fluxo.close();
		} else {
			throw new IOException("Arquivo inválido");
		}
	}
}
