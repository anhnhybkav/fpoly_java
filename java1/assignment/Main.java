package assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<NhanVien> nhanViens = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        NhanVien nvhc1 = new NhanVien("001", "anh", 1000);
        NhanVien nvhc2 = new NhanVien("002", "huyen", 2000);
        NhanVien nvtt1 = new TiepThi("003", "linh", 1200, 3, 20);
        NhanVien nvtt2 = new TiepThi("004", "trang", 1000, 10, 20);
        NhanVien nvtp = new TruongPhong("005", "phuong", 2000, 1000);

        nhanViens.add(nvhc1);
        nhanViens.add(nvhc2);
        nhanViens.add(nvtt1);
        nhanViens.add(nvtt2);
        nhanViens.add(nvtp);

        // in danh sach nhan vien
        // for(NhanVien nhanVien : nhanViens) {
        // nhanVien.xuatThongTin();
        // }

        // tim kiem nhan vien theo id
        // String id_read = scanner.nextLine();
        // for(NhanVien nhanVien : nhanViens) {
        // if(nhanVien.getMaNV().equalsIgnoreCase(id_read)) {
        // nhanVien.xuatThongTin();
        // break;
        // }
        // }

        // // xoa nhan vien theo ma
        // String id_del = scanner.nextLine();
        // for(NhanVien nhanVien : nhanViens) {
        // if(nhanVien.getMaNV().equalsIgnoreCase(id_del)) {
        // nhanViens.remove(nhanVien);
        // break;
        // }
        // }

        // cap nhap nhan vien theo ma
        // String id_up = scanner.nextLine();
        // for(NhanVien nhanVien : nhanViens) {
        // if(nhanVien.getMaNV().equalsIgnoreCase(id_up)) {
        // System.out.println("Thong tin ban dau: ");
        // nhanVien.xuatThongTin();
        // System.out.println("Cap nhap thong tin nhan vien co id " + id_up + ": ");
        // System.out.print("ten: ");
        // String hoTen = scanner.nextLine();
        // nhanVien.setHoTen(hoTen);
        // System.out.print("luong: ");
        // double luong = Double.parseDouble(scanner.nextLine());
        // nhanVien.setLuong(luong);
        // System.out.println("Thong tin sau khi update: ");
        // nhanVien.xuatThongTin();
        // break;
        // }
        // }

        // tim kiem nhan vien theo khoang luong
        // double min = Double.parseDouble(scanner.nextLine());
        // double max = Double.parseDouble(scanner.nextLine());
        // for(NhanVien nhanVien : nhanViens) {
        // double luong = nhanVien.getLuong();
        // if(luong >= min && luong <= max) {
        // nhanVien.xuatThongTin();
        // }
        // }


        // sap xep nhan vien theo ten
        // Comparator<NhanVien> comp1 = new Comparator<NhanVien>() {
        //     @Override
        //     public int compare(NhanVien nv1, NhanVien nv2) {
        //         return nv1.getHoTen().compareTo(nv2.getHoTen());
        //     }
        // };
        // Collections.sort(nhanViens, comp1);

        // sap xep nhan vien theo thu nhap
        Comparator<NhanVien> comp2 = new Comparator<NhanVien>() {
            @Override
            public int compare(NhanVien nv1, NhanVien nv2) {
                return nv1.getThuNhap() < nv2.getThuNhap() ? 1 : -1;
            }
        };
        Collections.sort(nhanViens, comp2);
        for (NhanVien nhanVien : nhanViens) {
            nhanVien.xuatThongTin();
        }

        scanner.close();
    }
}
