package java2.lab4.pack2;

public class MyThread extends Thread {
    private String name;
    public MyThread(String name) {
        this.name = name;
    }
    public void run() {
        try {
            System.out.println("\nTrong run() " + name);
            for(int i = 0; i < 10; i++) {
                System.out.print(i + " ");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Catch: " + e);
        }
    }
}
