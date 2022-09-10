package java2.lab4.bai2;

public class Thread1 extends Thread {
    public void run() {
        for(int i = 1; i <= 10; i++) {
            if(i % 2 == 0) {
                System.out.print(i + " ");
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                // TODO: handle exception
            }
        }
    }
}
