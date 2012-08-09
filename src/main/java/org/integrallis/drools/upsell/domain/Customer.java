package org.integrallis.drools.upsell.domain;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Customer {
	public enum Profile { NEW, BRONZE, SILVER, GOLD, PLATINUM }
	
	private Profile profile;
	private List<Product> products;
	private Double combinedBalance = 0.0;
	private Date customerSince;
	private String name;
	
	public Customer(String name, Double combinedBalance, Date customerSince) {
		this.combinedBalance = combinedBalance;
		this.customerSince = customerSince;
		this.name = name;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}

	public Profile getProfile() {
		return profile;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public List<Product> getProducts() {
		return products;
	}
	
	public void addProducts(Product... products) {
        this.products.addAll(Arrays.asList(products));
	}

	public void setCombinedBalance(Double combinedBalance) {
		this.combinedBalance = combinedBalance;
	}

	public Double getCombinedBalance() {
		return combinedBalance;
	}

	public void setCustomerSince(Date customerSince) {
		this.customerSince = customerSince;
	}

	public Date getCustomerSince() {
		return customerSince;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return name + " " + combinedBalance + " " + profile; 
	}
	
}
