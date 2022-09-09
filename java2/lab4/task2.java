package java2.lab4;

public class task2 implements Runnable {
    int count = 0;
    @Override
    public void run() {
       System.out.println(++count);
    }
    
}
