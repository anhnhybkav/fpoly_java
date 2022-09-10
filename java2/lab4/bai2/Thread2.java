package java2.lab4.bai2;

public class Thread2 extends Thread {
        public void run() {
            for(int i = 1; i <= 10; i++) {
                if(i % 2 == 1) {
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
