package assignment;

public class TruongPhong extends NhanVien {
    private double luongTrachNhiem;

    public TruongPhong(String maNV, String hoTen, double luong, double luongTrachNhiem) {
        super(maNV, hoTen, luong);
        this.luongTrachNhiem = luongTrachNhiem;
    }
    
    public double getThuNhap() {
        double thuNhap = getLuong() + luongTrachNhiem;
        return thuNhap;
    }
}
