package br.com.etcesp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;

@SpringBootApplication
public class EtcespServiceGraphQlApplication {

	public static void main(String[] args) {
		SpringApplication.run(EtcespServiceGraphQlApplication.class, args);
	}

}
