package shop.model.pay;

import shop.model.Payable;

public abstract class Payment implements Payable{
    private String payType;

    public String getPayType() {
        return this.payType;
    }

    public abstract boolean processPay(int finalAmount);
}