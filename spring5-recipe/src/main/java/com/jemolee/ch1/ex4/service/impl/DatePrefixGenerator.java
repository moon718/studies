package com.jemolee.ch1.ex4.service.impl;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.jemolee.ch1.ex4.service.PrefixGenerator;

public class DatePrefixGenerator implements PrefixGenerator {
	private DateFormat formatter; 
	 
	public void setPattern(String pattern) { 
		this.formatter = new SimpleDateFormat(pattern); 
	} 
	 
	@Override 
	public String getPrefix() { 
		return formatter.format(new Date()); 
	} 
}
