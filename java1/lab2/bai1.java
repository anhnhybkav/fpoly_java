package lab2;

import java.util.Scanner;

public class bai1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap he so:");
        System.out.print("a = ");
        double a = scanner.nextDouble();
        System.out.print("b = ");
        double b = scanner.nextDouble();
        math.phuongTrinhBacNhat(a, b);
        scanner.close();
    }
}