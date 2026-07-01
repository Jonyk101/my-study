package shop.model.pay;

public class CardPayment extends Payment{
    private String cardCompany, ownerName, cardNum;
    // 등록할 카드사, 소유주, 카드번호(카드번호는 포맷을 설정하여 받도록 진행한다. xxxx-xxxx-xxxx-xxxx


    public CardPayment(String cardCompany, String ownerName, String cardNum) {
        super();
    }

    @Override
    public boolean processPay(int finalAmount) {
        return false;
    }



}