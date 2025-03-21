package com.olivertech.Desafio.back_end;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jdbc.repository.config.EnableJdbcAuditing;

@EnableJdbcAuditing
@SpringBootApplication
public class DesafioBackEndApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesafioBackEndApplication.class, args);
	}

}
