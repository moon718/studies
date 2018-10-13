package com.jemolee.ch1.ex4.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.jemolee.ch1.ex4.service.PrefixGenerator;
import com.jemolee.ch1.ex4.service.impl.DatePrefixGenerator;

@Configuration
public class PrefixConfiguration {
	@Bean
	public PrefixGenerator datePrefixGenerator() {
		DatePrefixGenerator dpg = new DatePrefixGenerator();
		dpg.setPattern("yyyyMMdd");
		
		return dpg;
	}
}
