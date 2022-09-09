package lab5.bai3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    static ArrayList<SanPham> list = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        menu();
        while (true) {
            System.out.print("Nhap lua chon: ");
            int option = Integer.parseInt(scanner.nextLine());
            if (option == 5) {
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
                default:
                    break;
            }
        }
    }
    
    private static void option1() {
        while(true) {
            System.out.print("Nhap ten san pham: ");
            String name = scanner.nextLine();
            System.out.print("Nhap gia san pham: ");
            double gia = Double.parseDouble(scanner.nextLine());
            SanPham sp = new SanPham(name, gia);
            list.add(sp);
            System.out.print("Nhap them(Y/N)? ");
            if(scanner.nextLine().equalsIgnoreCase("N")) {
                break;
            }
        }
    }

    private static void option2() {
        Collections.sort(list);
        for(SanPham sp : list) {
            System.out.println(sp);
        }
    }

    private static void option3() {
        System.out.print("nhap ten san pham can xoa: ");
        String name = scanner.nextLine();
        for(SanPham sp : list) {
            if(sp.getName().equalsIgnoreCase(name)) {
                list.remove(sp);
                break;
            }
        }
    }

    private static void option4() {
        double tongGia = 0;
        for(SanPham sp : list) {
            tongGia += sp.getGia();
        }
        System.out.println("gia trung binh san pham: " + tongGia / list.size());
    }

    public static void menu() {
        System.out.println("Chon chuc nang");
        System.out.println("1. Nhap danh sach san pham");
        System.out.println("2. Sap xep giam dan theo gia va xuat ra man hinh");
        System.out.println("3. Tim va xoa san pham theo ten");
        System.out.println("4. Xuat gia trung binh san pham");
        System.out.println("5. Ket thuc");
    }
}
