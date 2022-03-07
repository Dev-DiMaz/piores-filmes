package com.dmazui.pioresfilmes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.dmazui.pioresfilmes.Utils.FileUtil;

@SpringBootApplication
public class PioresFilmesApplication {

	public static void main(String[] args) {
		SpringApplication.run(PioresFilmesApplication.class, args);
		
		FileUtil.readFiles();
	} 
}
