package com.jemolee.ch1.ex3.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.jemolee.ch1.ex3.Product;
import com.jemolee.ch1.ex3.product.Battery;
import com.jemolee.ch1.ex3.product.Disc;

@Configuration
public class ShopConfiguration {
	@Bean
	public Product aaa() {
		Battery battery = new Battery("AAA", 1000.0);
		battery.setRechargerable(true);
		return battery;
	}
	
	@Bean
	public Product cdrw() {
		Disc disc = new Disc("CD-RW", 1500.0);
		disc.setCapacity(3072);
		
		return disc;
	}

}
