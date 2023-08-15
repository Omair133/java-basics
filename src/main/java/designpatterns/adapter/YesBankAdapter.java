package designpatterns.adapter;

import designpatterns.adapter.yesbank.YesBankAPI;

public class YesBankAdapter implements BankAPIAdapter {

    private YesBankAPI yesBankAPI = new YesBankAPI();
    @Override
    public double getBalance(String accountNumber) {
        return 0;
    }

    @Override
    public boolean sendMoney(String fromAccount, String toAccount, double amount) {
        return false;
    }
}
