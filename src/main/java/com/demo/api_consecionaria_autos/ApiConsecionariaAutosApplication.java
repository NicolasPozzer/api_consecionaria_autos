package com.demo.api_consecionaria_autos;

import com.demo.api_consecionaria_autos.model.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class ApiConsecionariaAutosApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiConsecionariaAutosApplication.class, args);
	}

}
