package com.ctf.blitz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@EnableAutoConfiguration
@Configuration
@ComponentScan("com.ctf.blitz")
public class MetamorfApplication {

	public static void main(String[] args) {
		SpringApplication.run(MetamorfApplication.class, args);
	}
}
