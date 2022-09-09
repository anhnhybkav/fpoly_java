package java2.lab2;

import java.util.Scanner;

public class bai1_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int[] arr = new int[5];
        for(int i = 0; i < 5; i++) {
            arr[i] = scanner.nextInt();
            sum += arr[i];
        }
        System.out.println(sum);
        try {
            arr[5] = scanner.nextInt();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        scanner.close();
    }
}
