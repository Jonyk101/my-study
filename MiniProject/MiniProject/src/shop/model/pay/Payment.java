package shop.model.pay;

import shop.model.Payable;

public abstract class Payment implements Payable{
	private String paytype;
	
	public boolean processPay(int amount) {
		return false;
		
	}
}
