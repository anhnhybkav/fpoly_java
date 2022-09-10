package java2.lab5;

import java.util.Scanner;

public class bai3 {
    @Deprecated
    static public boolean cardNumber(String card) {
        int sum = 0;
        for(int i = 0; i < card.length(); i++) {
            sum += Integer.parseInt(card.substring(i, i+1));
        }
        if(sum % 2 == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String card = scanner.nextLine().replaceAll("\\s+", "");
        if(cardNumber(card)) {
            System.out.println("tong chan");
        } else {
            System.out.println("tong le");
        }
        scanner.close();
    }
}
