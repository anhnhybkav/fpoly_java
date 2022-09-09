package lab1;

import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap he so cua phuong trinh bac 2");
        System.out.print("a = ");
        double a = scanner.nextDouble();
        System.out.print("b = ");
        double b = scanner.nextDouble();
        System.out.print("c = ");
        double c = scanner.nextDouble();

        double delta = Math.pow(b, 2) - 4*a*c;
        if(delta < 0) {
            System.out.println("delta < 0");
        } else {
            System.out.println("Can bac 2 cua delta = " + (double)Math.round(Math.sqrt(delta)*100)/100);
        }
        scanner.close();
    }
}
