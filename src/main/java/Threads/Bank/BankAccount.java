package Threads.Bank;

public class BankAccount {
    private int balance;

    public BankAccount(int balance) {
        this.balance = balance;
    }

    public synchronized int getBalance() {
        return balance;
    }

   public  synchronized void deposit(int deposit){
        balance = balance + deposit;
   }


}
