package com.dmazui.pioresfilmes.Utils;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileUtil {

	public static void readFiles() {
		for (int i = 0; i < 1; i++) {
			File file = new File("target\\arquivoCSV\\movielist.csv");
			Scanner sc = null;
	
			try {
				sc = new Scanner(file);
				while (sc.hasNextLine()) {
					// converte JSON 
					// chama metodo enviando JSON
					
					sendToDataBase(sc.nextLine().toString());
	
				}
			} catch (IOException e) {
				System.out.println(e.getMessage());
			} finally {
				sc.close();
			}
		}
	}
	
	private static void sendToDataBase(String obj) {
		System.out.println(obj.toString());
	}
}
