package com.example.m_core_1;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.core.SpringVersion;
import org.springframework.stereotype.Component;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class MCore1Application {



	public static void main(String[] args) {
		SpringApplication.run(MCore1Application.class, args);

	}
@Bean
	public RestTemplate restTemplate(){
		return new RestTemplateBuilder().build();
}
}
