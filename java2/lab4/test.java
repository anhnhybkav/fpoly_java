package java2.lab4;

public class test {


    public static void main(String[] args) {
        Thread t2 = new Thread(new task2());
        t2.start();
    }
}
