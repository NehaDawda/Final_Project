package com.boot.startup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

/*
 * URL: http://localhost:8082/hello
 */
@SpringBootApplication
@ComponentScan(basePackages="com.jp.lms.source.controllers, "
		+ "com.jp.lms.source.daos, "
		+ "com.jp.lms.source.services"
		)
@EntityScan("com.jp.lms.source.entities")
public class SprinBootStartup {
	
	public static void main(String[] args) {
		SpringApplication.run(SprinBootStartup.class, args);
	}
}
