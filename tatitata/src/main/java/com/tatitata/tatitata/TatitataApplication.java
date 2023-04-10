package com.tatitata.tatitata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({ "com.tatitata.tatitata.*" })
public class TatitataApplication {

	public static void main(String[] args) {
		SpringApplication.run(TatitataApplication.class, args);
	}

}
