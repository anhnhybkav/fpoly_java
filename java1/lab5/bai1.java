package lab5;

import java.util.ArrayList;
import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> list = new ArrayList<>();
        while(true) {
            Double x = Double.parseDouble(scanner.nextLine());
            list.add(x);

            System.out.println("Nhap them (Y/N)?");
            if(scanner.nextLine().equals("N")) {
                break;
            }
        }
        for(Double a : list) {
            System.out.print(a + " ");
        }

        scanner.close();
    }
}
