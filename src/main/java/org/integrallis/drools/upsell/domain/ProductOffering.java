package org.integrallis.drools.upsell.domain;

public class ProductOffering {
	private Customer customer;
	private Product product;

	public ProductOffering(Customer customer, Product product) {
		this.customer = customer;
		this.product = product;
	}

	public Product getProduct() {
		return product;
	}

	public Customer getCustomer() {
		return customer;
	}
}
