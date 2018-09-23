package Threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class App {


    public static void main(String[] args) {

        Runnable runnable = () -> {
            ExecutorService es = Executors.newFixedThreadPool(3);

            Thr thr = new Thr(2, 5);
            Thr thr1 = new Thr(5, 4);
            Thr thr2 = new Thr(4, 55);
            Thr thr3 = new Thr(11, 6);

            Thr[] threadArr = new Thr[4];
            threadArr[0] = thr;
            threadArr[1] = thr1;
            threadArr[2] = thr2;
            threadArr[3] = thr3;

            for (int i = 0; i < threadArr.length; i++) {
                es.submit(threadArr[i]);
            }
            System.out.println(es.isTerminated());

        };

    Thread thread = new Thread(runnable);
    thread.start();
        System.out.println(thread.isAlive());
    }
}