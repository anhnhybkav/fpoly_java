package java2.lab4.pack2;

public class SimpleThread extends Thread {
    public SimpleThread(String str) {
        super(str);
    }
    public void run() {
        for(int i = 0; i < 10; i++) {
            System.out.println(i + " " + this.getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO: handle exception
            }
        }
    }
}
