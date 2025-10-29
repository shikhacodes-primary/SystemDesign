package DesignPatterns.TemplateMethodDesignPattern;

public class PayToMerchantPaymentFlow extends PaymentFlow {

    @Override
    public void validateRequest() {
        System.out.println("pay to merchant validate req");
    }

    @Override
    public void calculateFee() {
        System.out.println("pay to merchant calculate fee");
    }

    @Override
    public void debitAmount() {
        System.out.println("pay to merchant debit amount");
    }

    @Override
    public void creditAmount() {
        System.out.println("pay to merchant credit amount");
    }
}
