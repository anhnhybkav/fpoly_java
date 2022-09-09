package lab3;

import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so sinh vien: ");
        int n = Integer.parseInt(scanner.nextLine());
        String name[] = new String [n];
        int point[] = new int[n];
        for(int i = 0; i < n; i++) {
            System.out.print("Nhap ten: ");
            name[i] = scanner.nextLine();
            System.out.print("Nhap diem: ");
            point[i] = Integer.parseInt(scanner.nextLine());
        }
        for(int i = 0; i < n - 1; i++) {
            for(int j = i+1; j < n; j++) {
                if(point[i] > point[j]) {
                    int pointTmp = point[i];
                    point[i] = point[j];
                    point[j] = pointTmp;

                    String nameTmp = name[i];
                    name[i] = name[j];
                    name[j] = nameTmp;
                }
            }
        }
        String hocLuc[] = new String[n];
        for(int i = 0; i < n; i ++) {
            String hocLucTmp = "";
            int value = point[i];
            if(value < 5) {
                hocLucTmp = "Yeu";
            }
            else if(value < 6.5) {
                hocLucTmp = "trung binh";
            }
            else if(value < 7.5) {
                hocLucTmp = "Kha";
            }
            else if(value < 9) {
                hocLucTmp = "Gioi";
            }
            else {
                hocLucTmp = "Xuat sac";
            }
            hocLuc[i] = hocLucTmp;
        }

        for(int i = 0; i < n; i++) {
            System.out.printf("%s %d diem, hoc luc: %s\n", name[i], point[i], hocLuc[i]);
        }

        scanner.close();
    }
}
