package shop.model;


import java.time.LocalDate;
import java.util.ArrayList;
/*
 * 전반적인 고객에 관한 모델들을 정의하기 위한 클래스
 * 
 */
import java.util.List;

import shop.model.pay.Payment;

public class Customer {
	private String id, password, name, phoneNum;
	private LocalDate signDate;
	private int cPoint;
	private String Status; // 일반 유저에게 보이지않는 관리자 분기 나누는 칸
	private List<Payment> myPayments = new ArrayList<>();
	
	public Customer() {
		
	}
	
	public Customer(String id, String password, String name, String phoneNum) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.phoneNum = phoneNum;
		signDate = LocalDate.now();
	}
	
	public boolean usePoint(int amount) {
		if(amount > 0) {
			// amount 에서 사용하고자 하는 포인트를 빼기
		}else {
			
		}
		return false;
	}
	
	public void addPayment(Payment pay) {
		
	}
	
}
