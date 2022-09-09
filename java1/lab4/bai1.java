package lab4;

// import java.util.Scanner;

class SanPham {
    private String tenSanPham;
    private double donGia;
    private double giamGia;

    public SanPham(String tenSanPham, double donGia, double giamGia) {
        this.tenSanPham = tenSanPham;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }

    public SanPham(String tenSanPham, double donGia) {
        this(tenSanPham, donGia, 0);
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public double getGiamGia() {
        return giamGia;
    }

    public void setGiamGia(double giamGia) {
        this.giamGia = giamGia;
    }

    private double getThueNhapKhau() {
        return donGia * 0.1;
    }

    // public void nhap() {
    //     Scanner sc = new Scanner(System.in);
    //     tenSanPham = sc.nextLine();
    //     donGia = Double.parseDouble(sc.nextLine());
    //     giamGia = Double.parseDouble(sc.nextLine());
    //     sc.close();
    // }

    public void xuat() {
        System.out.println("Ten san pham: " + tenSanPham);
        System.out.println("Don gia: " + donGia);
        System.out.println("Giam gia: " + giamGia);
        System.out.println("Thue nhap khau: " + getThueNhapKhau());

    }
}

public class bai1 {

    public static void main(String[] args) {
        SanPham a = new SanPham("des1", 100, 10);
        SanPham b = new SanPham("mh2", 50, 0);
        a.xuat();
        b.xuat();
    }
}
