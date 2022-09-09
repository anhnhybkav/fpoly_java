package lab5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class bai2 {
    static ArrayList<String> names = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        menu();
        while (true) {
            System.out.print("Nhap lua chon: ");
            int option = Integer.parseInt(scanner.nextLine());
            if (option == 6) {
                break;
            }
            switch (option) {
                case 1:
                    option1();
                    break;
                case 2:
                    option2();
                    break;
                case 3:
                    option3();
                    break;
                case 4:
                    option4();
                    break;
                case 5:
                    option5();
                    break;
                default:
                    break;
            }
        }
    }

    public static void option1() {
        while (true) {
            String name = scanner.nextLine();
            if (name.equals("0")) {
                break;
            }
            names.add(name);
        }
    }

    public static void option2() {
        int stt = 1;
        for (String name : names) {
            System.out.println(stt++ + ". " + name);
        }
    }

    public static void option3() {
        Collections.shuffle(names);
        option2();
    }

    public static void option4() {
        Comparator<String> comp = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.compareTo(s2);
            }
        };
        Collections.sort(names, comp);
        option2();
    }

    public static void option5() {
        System.out.print("Nhap ten can xoa: ");
        String name = scanner.nextLine();
        names.remove(name);
    }

    public static void menu() {
        System.out.println("Chon chuc nang");
        System.out.println("1. Nhap danh sach ho ten");
        System.out.println("2. Xuat danh sach vua nhap");
        System.out.println("3. Xuat danh sach ngau nhien");
        System.out.println("4. Sap xep giam dan va xuat danh sach");
        System.out.println("5. Tim va xoa ho ten nhap tu ban phim");
        System.out.println("6. Ket thuc");
    }
}
