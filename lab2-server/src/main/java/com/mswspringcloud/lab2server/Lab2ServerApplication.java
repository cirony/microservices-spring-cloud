package com.mswspringcloud.lab2server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class Lab2ServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Lab2ServerApplication.class, args);
	}

}
