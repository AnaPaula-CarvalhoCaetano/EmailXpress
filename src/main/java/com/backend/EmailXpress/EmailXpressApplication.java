package com.backend.EmailXpress;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;



@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class EmailXpressApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmailXpressApplication.class, args);
	}

}
