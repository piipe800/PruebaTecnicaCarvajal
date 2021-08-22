package com.prueba.adn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.prueba.adn.security.jwt.JwtTokenFilter;

@SpringBootApplication
public class PruebaAdnApplication {

	public static void main(String[] args) {
		SpringApplication.run(PruebaAdnApplication.class, args);
	}

	
}
