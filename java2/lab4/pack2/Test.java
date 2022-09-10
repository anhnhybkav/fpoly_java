package java2.lab4.pack2;

public class Test {
    public static void main(String[] args) {
        // FirstThread firstThread = new FirstThread();
        // SecondThread secondThread = new SecondThread();
        // Thread thread1 = new Thread(firstThread);
        // thread1.start();
        // Thread thread2 = new Thread(secondThread);
        // thread2.start();

        // SimpleThread s1 = new SimpleThread("Ho Chi Minh city");
        // SimpleThread s2 = new SimpleThread("Ha Noi city");
        // s1.start();
        // s2.start();

        // Thread t1 = new Thread(new Multi3());
        // Thread t2 = new Thread(new Multi3());
        // t1.start();
        // t2.start();

        // ExtendsThread et = new ExtendsThread();
        // Thread ir = new Thread(new ImplementRunnable());

        // et.start();
        // ir.start();

        // try {
        //     MyThread th1 = new MyThread("Thread 1");
        //     MyThread th2 = new MyThread("Thread 2");
        //     th1.start();
        //     th1.join();
        //     th2.start();
        // } catch (InterruptedException e) {
        //     System.out.println(e);
        // }

        final Customer c = new Customer();
        Thread th1 = new Thread() {
            public void run() {
                c.withdraw(1500);
            }
        };
        th1.start();

        Thread th2 = new Thread() {
            public void run() {
                c.deposit(2000);
            }
        };
        th2.start();
    }
}
