package shop.model.pay;

public class CashPayment extends Payment {
	private String bankName; // 등록할 은행 등록
	private String depositorName; // 입금자명
	
	
	@Override
	public boolean processPay(int amount) {
		return super.processPay(amount);
	}
	
	

}
