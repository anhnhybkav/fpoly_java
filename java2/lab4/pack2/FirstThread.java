package java2.lab4.pack2;

public class FirstThread implements Runnable {

    @Override
    public void run() {
        for(int i = 1; i <= 10; i++) {
            System.out.println("message from first thread: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("first thread error: " + e);
            }
        }
    }
    
}
