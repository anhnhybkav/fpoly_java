package lab2;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap he so:");
        System.out.print("a = ");
        double a = scanner.nextDouble();
        System.out.print("b = ");
        double b = scanner.nextDouble();
        System.out.print("c = ");
        double c = scanner.nextDouble();
        if(a == 0) {
            math.phuongTrinhBacNhat(b, c);
        } else {
            math.phuongTrinhBacHai(a, b, c);
        }
        scanner.close();
    }

}
