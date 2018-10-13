package com.spring5.ch1.ex5_1.product;

import com.spring5.ch1.ex3.Product;

public class Disc extends Product {
	private int capacity;

	public Disc() {
		super();
	}
	
	public Disc(String name, double price) {
		super(name, price);
	}
	
	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	
}
