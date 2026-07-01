package shop.model.pay;

public class CashPayment extends Payment {
    private String bankName; // 등록할 은행 등록
    private String depositorName; // 입금자명

    public CashPayment(String bankName, String depositorName) {
        super();
    }


    @Override
    public boolean processPay(int finalAmount) {
        return false;
    }

}