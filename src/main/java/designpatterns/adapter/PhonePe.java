package designpatterns.adapter;

public class PhonePe {
    private BankAPIAdapter bankAPI;
    public PhonePe(BankAPIAdapter bankAPI){
        this.bankAPI = bankAPI;
    }
    void doSomething() {
        double balance = bankAPI.getBalance("123");
    }
}
