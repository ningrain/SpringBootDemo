package com.gta;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
/**
 * 此注解包含
 * @Configuration
 * @EnableAutoConfiguration
 * @ComponentScan
 * 三个注解
 * */
public class SpringBootDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemoApplication.class, args);
	}
}
