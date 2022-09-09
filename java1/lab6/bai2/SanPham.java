package lab6.bai2;

public class SanPham {
    private String tenSp;

    private double donGia;

    private String hang;

    public SanPham(String tenSp, double donGia, String hang) {
        this.tenSp = tenSp;
        this.donGia = donGia;
        this.hang = hang;
    }

    // public void nhap() {
        
    // }

    public void xuat() {
        System.out.println("TenSP: " + tenSp);
        System.out.println("DonGia: " + donGia);
        System.out.println("Hang: " + hang);
    }

    public String getHang() {
        return hang;
    }
}
