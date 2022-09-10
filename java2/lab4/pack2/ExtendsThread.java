package java2.lab4.pack2;

public class ExtendsThread extends Thread {
    private int counter = 0;

    public void run() {
        for (int i = 0; i < 10; i++) {
            counter++;
            System.out.println("ExtendsThread: Countter = " + counter);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO: handle exception
            }
        }
    }
}
