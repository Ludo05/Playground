package Threads.Bank;

import java.util.StringJoiner;

public class Worker implements Runnable {
    private BankAccount bankAccount;
    private int id;



    public Worker(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }



    @Override
    public void run() {
        for (int i = 0; i < 10 ; i++) {
            int startBalance = bankAccount.getBalance();
            synchronized (bankAccount) {
                bankAccount.deposit(10);
            }
            int endBalance = bankAccount.getBalance();
            String m = String.format("Start balance: %d  End balance: %d",startBalance,endBalance);
            System.out.println(m);
        }
    }
}
