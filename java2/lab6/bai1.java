package java2.lab6;

import java.util.ArrayList;

public class bai1 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList<>();
        list.add(5);
        list.add(5.1);
        list.add(true);
        list.add("5.2");
        for(Object obj : list) {
            System.out.println(obj);
        }
    }
}
