package DesignPatterns.TemplateMethodDesignPattern;

public abstract class PaymentFlow {

    public abstract void validateRequest();
    public abstract void calculateFee();
    public abstract void debitAmount();
    public abstract void creditAmount();

    public final void sendMoney() {
        validateRequest();
        calculateFee();
        debitAmount();
        creditAmount();
    }
}
