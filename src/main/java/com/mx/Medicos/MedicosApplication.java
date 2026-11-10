package com.mx.Medicos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MedicosApplication {

	public static void main(String[] args) {
		SpringApplication.run(MedicosApplication.class, args);
	}

}
