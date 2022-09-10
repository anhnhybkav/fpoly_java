package java2.lab5;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numStr1 = scanner.nextLine();
        String numStr2 = scanner.nextLine();
        double num1 = 0;
        double num2 = 0;
        try {
            num1 = Double.parseDouble(numStr1);
            num2 = Double.parseDouble(numStr2);
        } catch (Exception e) {
            System.out.println("Yeu cau nhap dung dinh dang so");
        }
        System.out.println(num1+num2);
        scanner.close();
    }
}
