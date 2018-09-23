package Threads.Bank;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        BankAccount bankAccount = new BankAccount(100);
        for (int i = 0; i < 5 ; i++) {
            Worker worker = new Worker(bankAccount);
            executorService.submit(worker);
        }
    }
}
