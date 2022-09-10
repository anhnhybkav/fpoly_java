package java2.lab4.pack2;

public class Customer {
    int amount = 1000;
    public synchronized void withdraw(int m) {
        System.out.println("Ban dang rut tien...");
        if(amount < m) {
            System.out.println("khong du tien de rut!");
            try {
                wait();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        amount = amount - m;
        System.out.println("ban da rut tien thanh cong !!!");
    }
    synchronized void deposit(int m) {
        System.out.println("ban dang nap tien...");
        amount = amount + m;
        System.out.println("nap tien thanh cong !!!");
        notify();
    }
}
