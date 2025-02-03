package com.goulart.api_estacionamento;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiEstacionamentoApplication {

	// http://localhost:8080/h2-console/
	// http://localhost:8080/swagger-ui/index.html#/
	public static void main(String[] args) {
		SpringApplication.run(ApiEstacionamentoApplication.class, args);
	}
}