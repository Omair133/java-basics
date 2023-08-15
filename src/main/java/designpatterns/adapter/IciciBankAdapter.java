package designpatterns.adapter;

import designpatterns.adapter.icicibank.IciciBankAPI;

public class IciciBankAdapter implements BankAPIAdapter {

    private IciciBankAPI iciciBankAPI = new IciciBankAPI();
    @Override
    public double getBalance(String accountNumber) {
        return 0;
    }

    @Override
    public boolean sendMoney(String fromAccount, String toAccount, double amount) {
        return false;
    }
}
