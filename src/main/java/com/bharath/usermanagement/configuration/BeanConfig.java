package com.bharath.usermanagement.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class BeanConfig {
	@Bean
	public WebClient.Builder webclient() {
		return WebClient.builder();
	}
}
