package lab1;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Họ tên: ");
        String hoTen = scanner.nextLine();
        System.out.print("Điểm tb: ");
        double diemTB = scanner.nextDouble();
        System.out.printf("%s %f điểm", hoTen, diemTB);
        scanner.close();
        // Integer.parseInt, scanner.nextLine()
    }
}
