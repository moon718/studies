package com.jemolee.ch1.ex4.dto;
import java.util.concurrent.atomic.AtomicInteger;

public class Sequence {
	private String prefix;
	private String suffix;
	private int initial;
	private final AtomicInteger counter = new AtomicInteger();
	
	public Sequence(String prefix, String suffix, int initial) {
		this.prefix = prefix;
		this.suffix = suffix;
		this.initial = initial;
	}
	
	public String getPrefix() {
		return prefix;
	}

	public String getSuffix() {
		return suffix;
	}

	public int getInitial() {
		return initial;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}
	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}
	public void setInitial(int initial) {
		this.initial = initial;
	}
	
	public String getSequence() {
		StringBuilder builder = new StringBuilder();
		
		builder.append(prefix)
			.append(initial)
			.append(counter.getAndIncrement())
			.append(suffix);
		
		return builder.toString();
	}
}
