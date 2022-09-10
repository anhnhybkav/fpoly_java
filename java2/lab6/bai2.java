package java2.lab6;

import java.util.ArrayList;

public class bai2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 1; i <= 10; i++) {
            list.add(i);
        }
        for(Integer i : list) {
            System.out.print(i + " ");
        }
    }
}
