package shop.model;

import shop.model.pay.Payment;

public class Order {
	private Customer customer;
	private Product product;
	private int quantity;
	private Payment payment;
	private int finalPrice;
}
