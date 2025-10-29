package DesignPatterns.TemplateMethodDesignPattern;

public class Main {
    public static void main(String[] args) {
        System.out.println("send money to friend");
        PaymentFlow friendFlow = new PayToFriendPaymentFlow();
        friendFlow.sendMoney();

        System.out.println("send money to merchant");
        PaymentFlow merchantFlow = new PayToFriendPaymentFlow();
        merchantFlow.sendMoney();
    }
}
