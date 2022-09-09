package java2.lab4;

public class task1 extends Thread {
    int count = 0;
    public void run() {
        System.out.println(count++);
    }
}
