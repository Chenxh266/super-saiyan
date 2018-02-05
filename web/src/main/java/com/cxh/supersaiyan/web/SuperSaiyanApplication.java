package com.cxh.supersaiyan.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
//@ImportResource("classpath:super-saiya.xml")
public class SuperSaiyanApplication {

	public static void main(String[] args) {
		System.out.println("Initing...");
		SpringApplication.run(SuperSaiyanApplication.class, args);
	}
}
