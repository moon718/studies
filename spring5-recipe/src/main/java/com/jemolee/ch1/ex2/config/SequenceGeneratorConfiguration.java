package com.jemolee.ch1.ex2.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
 
@Configuration
@ComponentScan(
	includeFilters = {
		@ComponentScan.Filter(
			type=FilterType.REGEX,
			pattern = {
				"com.jemolee.first_2.*.*Dao",
				"com.jemolee.first_2.*.*Service"
			}
	)},
	excludeFilters = {
		@ComponentScan.Filter(
			type=FilterType.ANNOTATION,
			classes= {org.springframework.stereotype.Controller.class}
		)
	}
)
public class SequenceGeneratorConfiguration {

}
