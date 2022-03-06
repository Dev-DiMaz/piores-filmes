package com.dmazui.pioresfilmes;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PioresFilmesApplication {

	public static void main(String[] args) {
		SpringApplication.run(PioresFilmesApplication.class, args);
		
		File file = new File("target\\arquivoCSV\\movielist.csv");
		Scanner sc = null;
		
		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			sc.close();
		}
	}

}
