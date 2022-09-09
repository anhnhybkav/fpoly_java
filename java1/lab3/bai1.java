package lab3;

import java.util.Scanner;

public class bai1 {
    public static boolean isPrime(int n) {
        if(n < 2) {
            return false;
        }
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = scanner.nextInt();
        if(isPrime(n)) {
            System.out.printf("%d la so nguyen to", n);
        } else {
            System.out.printf("%d khong la so nguyen to", n);
        }
        scanner.close();
    }
}
