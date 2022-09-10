package java2.lab4.pack2;

public class ImplementRunnable implements Runnable {
    private int counter = 0;
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            counter++;
            System.out.println("ImplementRunnable: Countter = " + counter);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO: handle exception
            }
        }
    }
    
}
