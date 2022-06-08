package com.iteriam.calculator.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.iteriam.calculator.service.util.TracerOwnerImpl;

import io.corp.calculator.TracerAPI;

@Configuration
public class ApplicationConfig {
	
	@Bean
	public TracerAPI getTracer() {
		return new TracerOwnerImpl();
	}


}
