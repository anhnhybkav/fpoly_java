package java2.lab4.bai3;

public class Main {
    public static void main(String[] args) {
        Number num = new Number();

        Thread th1 = new Thread() {
            public void run() {
                try {
                    num.print();
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        };
        th1.start(); 

        Thread th2 = new Thread() {
            public void run() {
                try {
                    num.check();
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        };
        th2.start();
    }
}
