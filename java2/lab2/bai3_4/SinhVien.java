package java2.lab2.bai3_4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SinhVien {
    private int masv;
    private String hoten;
    private int diem;
    private String xeploai;
    private static final int DIEM = 0;
    private static final String XEPLOAI = "CHUA_XEP_LOAI";
    private static final int MASV = 0;
    private static final String HOTEN = "CHUA_CO_TEN";

    public SinhVien(int masv, String hoten, int diem, String xeploai) {
        this.masv = masv;
        this.hoten = hoten;
        this.diem = diem;
        this.xeploai = xeploai;
    }

    public SinhVien() {
        this(MASV, HOTEN, DIEM, XEPLOAI);
    }

    public int getDiem() {
        return diem;
    }

    public void setDiem(int diem) {
        this.diem = diem;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public int getMasv() {
        return masv;
    }

    public void setMasv(int masv) {
        this.masv = masv;
    }

    public String getXeploai() {
        return xeploai;
    }

    public void setXeploai(String xeploai) {
        this.xeploai = xeploai;
    }

    public void setXeploai() {
        if (diem >= 8) {
            xeploai = "Gioi";
        } else if (diem >= 7) {
            xeploai = "Kha";
        } else if (diem >= 5) {
            xeploai = "Trung binh";
        } else {
            xeploai = "Kem";
        }
    }

    @Override
    public String toString() {
        return masv + "\t" + hoten + "\t" + diem + "\t" + xeploai + "\n";
    }

    public void nhapdl() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Nhap ma sinh vien: ");
            masv = scanner.nextInt();
            System.out.print("Nhap hoten: ");
            hoten = scanner.next();
            System.out.print("Nhap diem: ");
            diem = scanner.nextInt();
            this.setDiem(diem);
        } catch (InputMismatchException e) {
            System.out.println("ban phai nhap du lieu kieu so");
        }
        scanner.close();
    }

    public static void main(String[] args) {
        SinhVien s = new SinhVien();
        System.out.println("Sinh vien: " + s);
        s.nhapdl();
        s.setXeploai();
        System.out.println("Sau khi nhap:");
        System.out.println(s);
    }
}
