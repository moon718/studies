package com.spring5.ch1.ex3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring5.ch1.ex3.config.ShopConfiguration;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new AnnotationConfigApplicationContext(ShopConfiguration.class);
		
		Product aaa = context.getBean("aaa", Product.class);
		Product cdrw = context.getBean("cdrw", Product.class);
		
		System.out.println(aaa);
		System.out.println(cdrw);
	}

}
