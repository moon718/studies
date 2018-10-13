package com.spring5.ch1.ex4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring5.ch1.ex4.config.SequenceConfiguration;
import com.spring5.ch1.ex4.dao.SequenceDao;
import com.spring5.ch1.ex4.dto.Sequence;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new AnnotationConfigApplicationContext("com.jemolee.first_4");
		
		Sequence generator = (Sequence) context.getBean("sequenceGenerator"); 
		
		System.out.println(generator.getSequence()); 
		System.out.println(generator.getSequence()); 
	
		String[] beanNames = context.getBeanDefinitionNames();
		
		SequenceDao sequenceDao = (SequenceDao) context.getBean(SequenceDao.class);
		System.out.println(sequenceDao.getNextValue("IT"));
	}

}
