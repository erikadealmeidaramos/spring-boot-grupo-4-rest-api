package br.com.fit.exemplo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExemploApplication {

	//curl -X GET http://localhost:8080/test

	public static void main(String[] args) {
		SpringApplication.run(ExemploApplication.class, args);
	}

}
