package com.jemolee.ch1.ex1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jemolee.ch1.ex1.config.SequenceGeneratorConfiguration;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new AnnotationConfigApplicationContext(SequenceGeneratorConfiguration.class);
		
		SequenceGenerator seqGen = context.getBean(SequenceGenerator.class);
		
		System.out.println(seqGen.getSequence());
		System.out.println(seqGen.getSequence());
	}

}
