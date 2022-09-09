package lab1;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Canh hinh lap phuong: ");
        double a = scanner.nextDouble();
        System.out.println("The tich hinh lap phuong =  " + Math.pow(a, 3));
        scanner.close();
    }
}
