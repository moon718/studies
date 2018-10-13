package com.spring5.ch1.ex3.product;

import com.spring5.ch1.ex3.Product;

public class Battery extends Product{
	private boolean rechargerable;
	
	public Battery() {
		super();
	}

	public Battery(String name, double price) {
		super(name, price);
	}
	
	public boolean isRechargerable() {
		return rechargerable;
	}

	public void setRechargerable(boolean rechargerable) {
		this.rechargerable = rechargerable;
	}
	
	
}
