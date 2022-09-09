package lab1;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Canh thu nhat: ");
        double a = scanner.nextDouble();
        System.out.print("Canh thu hai: ");
        double b = scanner.nextDouble();
        System.out.println("Chu vi = " + (a+b)*2);
        System.out.println("Dien tich = " + a*b);
        System.out.println("Canh nho nhat = " + Math.min(a, b));
        scanner.close();
    }
}
