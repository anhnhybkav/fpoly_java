package assignment;

public class TiepThi extends NhanVien {
    private double doanhSo;
    private double hoaHong;

    public TiepThi(String maNV, String hoTen, double luong, double doanhSo, double hoaHong) {
        super(maNV, hoTen, luong);
        this.doanhSo = doanhSo;
        this.hoaHong = hoaHong;
    }
    
    public double getThuNhap() {
        double thuNhap = getLuong() + doanhSo * hoaHong;
        return thuNhap;
    }
}
