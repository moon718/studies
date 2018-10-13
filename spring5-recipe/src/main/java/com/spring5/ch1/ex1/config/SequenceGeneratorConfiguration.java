package com.spring5.ch1.ex1.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.spring5.ch1.ex1.SequenceGenerator;

@Configuration
public class SequenceGeneratorConfiguration {
	
	@Bean
	public SequenceGenerator sequenceGenerator() {
		SequenceGenerator seqGen = new SequenceGenerator();
		seqGen.setPrefix("30");
		seqGen.setSuffix("A");
		seqGen.setInitial(100000);
		
		return seqGen;
	}
}
