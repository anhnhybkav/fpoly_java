package lab3;

import java.util.Arrays;
import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        Arrays.sort(a);
        for(int num : a) {
            System.out.print(num + " ");
        }

        int size = 0, sum = 0;
        for(int num : a) {
            if(num % 3 == 0) {
                sum += num;
                size++;
            }
        }
        System.out.println((double)sum/size);
        scanner.close();
    }
}
