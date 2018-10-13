package com.spring5.ch1.ex2;

import java.util.concurrent.atomic.AtomicInteger;

public class Sequence {
	private String id;
	private String prefix;
	private String suffix;
	private final AtomicInteger counter = new AtomicInteger();

	public Sequence(String id, String prefix, String suffix) {
		this.id = id;
		this.prefix = prefix;
		this.suffix = suffix;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}
	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}
	
	public String getSequence() {
		StringBuilder builder = new StringBuilder();
		
		builder.append(prefix)
			.append(id)
			.append(counter.getAndIncrement())
			.append(suffix);
		
		return builder.toString();
	}
}
