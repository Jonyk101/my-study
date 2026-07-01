package shop.controller;

import java.util.ArrayList;
import java.util.List;

import shop.model.Customer;
import shop.model.Order;
import shop.model.Product;
import shop.model.pay.Payment;

public class ShopController {
	private List <Customer> customers = new ArrayList<>();
	private List <Product> products = new ArrayList<>();
	private Customer loggedInUser;
	private List <Product> cart = new ArrayList<>();
	
	public void startShopping() {
		
	}
	public boolean login(String id, String password) {
		boolean login = this.login(id, password);
		
		if(login == true) {
			System.out.println("로그인에 성공했습니다.");
		}else {
			System.out.println("id 혹은 password를 다시 확인해주세요");
		}
		return login;
	}
	
	public void signUp(Customer c) {
		
	}

	public void loadProductsFromCSV(String filPath) {
		
	}
	
	public void saveProductsToCSV(String filPath) {
		
	}
	
	public void showProduct() {		
		
	}
	
	public void addCart(String pCode) {
		
	}
	
	public void removeCart(String pCode) {
		
	}

	public void registerPayment(Payment pay) {
		
	}

	
	public void processCheckout() {
		
	}
	
}
