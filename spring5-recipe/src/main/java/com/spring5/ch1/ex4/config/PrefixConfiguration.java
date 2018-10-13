package com.spring5.ch1.ex4.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.spring5.ch1.ex4.service.PrefixGenerator;
import com.spring5.ch1.ex4.service.impl.DatePrefixGenerator;

@Configuration
public class PrefixConfiguration {
	@Bean
	public PrefixGenerator datePrefixGenerator() {
		DatePrefixGenerator dpg = new DatePrefixGenerator();
		dpg.setPattern("yyyyMMdd");
		
		return dpg;
	}
}
