package shop.model.pay;

public class EasyPayment extends Payment{
    private String providerName;
    // 등록할 간편결제 지원사 (단, 카카오페이, 네이버페이, 삼성페이 만을 지원하게끔 조건을 단다)


    public EasyPayment(String providerName) {
        super();
    }

    @Override
    public boolean processPay(int finalAmount) {
        return false;
    }
}