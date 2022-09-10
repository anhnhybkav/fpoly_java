package java2.lab4.bai2;

public class Main {
    
    public static void main(String[] args) {
        try {
            Thread1 thread1 = new Thread1();
            Thread2 thread2 = new Thread2();
            thread1.start();
            thread1.join();
            thread2.start();
        } catch (InterruptedException e) {
            // TODO: handle exception
        }
    }
}
