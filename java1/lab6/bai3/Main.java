package lab6.bai3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<SinhVien> list = new ArrayList<>();
        String reEmail = "^(.+)@(.+)$";
        String reSdt = "(84|0[3|5|7|8|9])+([0-9]{8})";
        String reCmnd = "[0-9]{9}";
        for(int i = 1; i <= 5; i++) {
            System.out.print("Nhap ten: ");
            String hoTen = scanner.nextLine();

            System.out.print("Nhap email: ");
            String email = scanner.nextLine();
            while(!email.matches(reEmail)) {
                System.out.print("Nhap lai email: ");
                email = scanner.nextLine();
            }

            System.out.print("Nhap sdt: ");
            String sdt = scanner.nextLine();
            while(!sdt.matches(reSdt)) {
                System.out.print("Nhap lai sdt: ");
                sdt = scanner.nextLine();
            }

            System.out.print("Nhap cmnd: ");
            String cmnd = scanner.nextLine();
            while(!cmnd.matches(reCmnd)) {
                System.out.print("Nhap lai cmnd: ");
                cmnd = scanner.nextLine();
            }
            SinhVien sv = new SinhVien(hoTen, email, sdt, cmnd);
            list.add(sv);
        }
        for(SinhVien sv : list) {
            System.out.println(sv);
        }
        scanner.close();
    }
}
