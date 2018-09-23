package Threads;

public class Thr implements Runnable {

    int a;
    int b;

    public Thr(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public  synchronized void run() {
        int m = this.getA() + this.getB();
        System.out.println(m);

    }


}
