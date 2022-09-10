package java2.lab4.bai3;

public class Number {
    int i = 1;
    public synchronized void print() throws InterruptedException {
        for(; i <= 10; i++) {
            System.out.print(i + " ");
            wait();
            // notify();
        }
    }

    public synchronized void check() throws InterruptedException {
        if(i % 2 == 0) {
            System.out.println("so chan");
        } else {
            System.out.println("so le");
        }
        wait();
        notify();
    }
}

