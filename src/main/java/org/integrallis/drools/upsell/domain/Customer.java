package org.integrallis.drools.upsell.domain;

import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Customer {
	public enum Profile { NEW, BRONZE, SILVER, GOLD, PLATINUM }
	
	private Profile profile;
	private Set<Product> products = new HashSet<Product>();
	private Set<Product> recommended = new HashSet<Product>();
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

	public void setProducts(Set<Product> products) {
		this.products = products;
	}

	public Set<Product> getProducts() {
		return products;
	}
	
	public void addProducts(Product... products) {
        this.products.addAll(Arrays.asList(products));
	}
	
	public boolean hasAllOfTheseProducts(Product... products) {
		return this.products.containsAll(Arrays.asList(products));
	}
	
	public boolean hasNoneOfTheseProducts(Product... products) {
		return !hasAllOfTheseProducts(products);
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

	public Set<Product> getRecommended() {
		return recommended;
	}

	public void setRecommended(Set<Product> recommended) {
		this.recommended = recommended;
	}
	
	public void addRecommendedProducts(Product... products) {
        this.recommended.addAll(Arrays.asList(products));
	}
	
}
