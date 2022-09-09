package lab2;

import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        System.out.println("+---------------------------------------------------+");
        System.out.println("1. Giai phuong trinh bac nhat");
        System.out.println("2. Giai phuong trinh bac hai");
        System.out.println("3. Tinh tien dien");
        System.out.println("4. Ket thuc");
        System.out.println("+---------------------------------------------------+");
        System.out.print("Chon chuc nang: ");

        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();
        switch (option) {
            case 1:
                System.out.print("a = ");
                double a = scanner.nextDouble();
                System.out.print("b = ");
                double b = scanner.nextDouble();
                math.phuongTrinhBacNhat(a, b);
                break;
            case 2:
                System.out.print("a = ");
                double a1 = scanner.nextDouble();
                System.out.print("b = ");
                double b1 = scanner.nextDouble();
                System.out.print("c = ");
                double c1 = scanner.nextDouble();
                math.phuongTrinhBacHai(a1, b1, c1);
                break;
            case 3:
                System.out.print("so dien = ");
                int soDien = scanner.nextInt();
                math.tinhTienDien(soDien);
                break;
            case 4:
                break;
            // default:
            //     System.out.println("Nhap dung lua chon");
            //     break;
        }
        scanner.close();
    }
}
