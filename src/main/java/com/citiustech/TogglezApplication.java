package com.citiustech;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.citiustech.config.CustomWebMvcConfigurer;

@SpringBootApplication
public class TogglezApplication {

	public static void main(String[] args) {
		SpringApplication.run(TogglezApplication.class, args);
	}
	
	@Bean
    public WebMvcConfigurer corsConfigurer() {
        return new CustomWebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**");
                //.allowedOrigins("http://localhost:9000");
            }
        };
    }
}