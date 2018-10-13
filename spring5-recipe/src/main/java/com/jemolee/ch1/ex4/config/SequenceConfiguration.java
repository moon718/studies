package com.jemolee.ch1.ex4.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.Import;

import com.jemolee.ch1.ex4.dao.SequenceDao;
import com.jemolee.ch1.ex4.dao.impl.SequenceDaoImpl;
import com.jemolee.ch1.ex4.dto.Sequence;
import com.jemolee.ch1.ex4.service.PrefixGenerator;

@Configuration
@Import(PrefixConfiguration.class)
@ComponentScan(
	includeFilters = {
		@ComponentScan.Filter(
			type=FilterType.REGEX,
			pattern = {
				"com.jemolee.first_4.*Dao",
			}
		)
	}
)
public class SequenceConfiguration {
	
	@Value("#{datePrefixGenerator}")
	private PrefixGenerator prefixGenerator;
	
	@Bean
	public Sequence sequenceGenerator() {
		Sequence sequence = new Sequence("IT", "TEST", 100);
		
		return sequence;
	}
//	
//	@Bean
//	public SequenceDao sequenceDao() {
//		SequenceDao sequenceDao = new SequenceDaoImpl();
//		
//		return sequenceDao;
//	}
}
