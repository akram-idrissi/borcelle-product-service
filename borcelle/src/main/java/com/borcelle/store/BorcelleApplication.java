package com.borcelle.store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class BorcelleApplication {

	public static void main(String[] args) {
		SpringApplication.run(BorcelleApplication.class, args);
	}

}
