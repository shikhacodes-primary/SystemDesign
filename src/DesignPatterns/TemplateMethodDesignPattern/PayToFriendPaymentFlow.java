package DesignPatterns.TemplateMethodDesignPattern;

public class PayToFriendPaymentFlow extends PaymentFlow {

    @Override
    public void validateRequest() {
        System.out.println("pay to friend validate req");
    }

    @Override
    public void calculateFee() {
        System.out.println("pay to friend calculate fee");
    }

    @Override
    public void debitAmount() {
        System.out.println("pay to friend debit amount");
    }

    @Override
    public void creditAmount() {
        System.out.println("pay to friend credit amount");
    }
}
