package lab6.bai2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<SanPham> list = new ArrayList<>();
        for(int i = 1; i <= 5; i++) {
            SanPham o = new SanPham(scanner.nextLine(), Double.parseDouble(scanner.nextLine()), scanner.nextLine());
            list.add(o);
        }
        for(SanPham sp : list) {
            if(sp.getHang().equalsIgnoreCase("Nokia")) {
                sp.xuat();
            }
        }
        scanner.close();
    }
}
