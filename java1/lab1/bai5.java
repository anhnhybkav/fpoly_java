package lab1;

import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        // De bai: Sinh so ngau nhien tu a den b
        Scanner scanner = new Scanner(System.in);
        System.out.print("a = ");
        int a = scanner.nextInt();
        System.out.print("b = ");
        int b = scanner.nextInt();
        double randomNum = Math.random()*(b-a)+ a;
        System.out.printf("sinh so ngau nhien tu %d den %d: %f", a, b, randomNum);
        scanner.close();
    }
}
