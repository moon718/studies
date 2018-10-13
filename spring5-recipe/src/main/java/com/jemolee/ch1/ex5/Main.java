package com.jemolee.ch1.ex5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jemolee.ch1.ex5.config.SequenceConfiguration;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context =
				new AnnotationConfigApplicationContext(SequenceConfiguration.class);

		SequenceGenerator generator =
				(SequenceGenerator) context.getBean("sequenceGenerator");

		System.out.println(generator.getSequence());
	    System.out.println(generator.getSequence());
	}

}
