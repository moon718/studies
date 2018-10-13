package com.spring5.ch1.ex2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring5.ch1.ex2.dao.SequenceDao;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext("com.jemolee.first_2");
		SequenceDao sequenceDao = context.getBean(SequenceDao.class);
	
		System.out.println(sequenceDao.getNextValue("IT"));
		System.out.println(sequenceDao.getNextValue("IT"));
		
		System.out.println(sequenceDao.getSequence("IT").getSequence());
		System.out.println(sequenceDao.getSequence("IT").getSequence());
	}
}
