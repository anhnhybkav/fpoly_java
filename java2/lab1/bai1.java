package java2.lab1;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double r = scanner.nextDouble();
        double PI = Math.PI;
        double chuVi = 2 * PI * r;
        double dienTich = PI * r * r;
        System.out.printf("Hinh tron ban kinh %f co chu vi = %f, dien tich = %f", r, chuVi, dienTich);
        scanner.close();
    }
}
