package com.example.crudsys;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class CrudSysApplication {
    private static final Logger log = LoggerFactory.getLogger(CrudSysApplication.class);
	public static void main(String[] args) {

		SpringApplication.run(CrudSysApplication.class, args);

	}
}


