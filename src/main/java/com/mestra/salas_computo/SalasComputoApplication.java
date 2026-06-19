package com.mestra.salas_computo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SalasComputoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SalasComputoApplication.class, args);

		int a = 1+1;
		System.out.println("hola " + a);
	}
}