package assignment;

public class NhanVien {
    private String maNV;
    private String hoTen;
    private double luong;

    public NhanVien(String maNV, String hoTen, double luong) {
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.luong = luong;
    }

    public String getMaNV() {
        return maNV;
    }

    public double getLuong() {
        return luong;
    }
    
    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    public double getThuNhap() {
        double thuNhap = luong;
        return thuNhap;
    }

    public double getThueThuNhap() {
        double thuNhap = getThuNhap();
        double thue = 0;
        if(thuNhap < 9000000) {
            thue = 0;
        } 
        else if(thuNhap < 15000000) {
            thue = thuNhap * 0.1;
        }
        else {
            thue = thuNhap * 0.12;
        }
        return thue;
    }

    public void xuatThongTin() {
        System.out.println("ma nv: " + maNV);
        System.out.println("ho ten: " + hoTen);
        System.out.println("thu nhap: " + getThuNhap());
        System.out.println("thue thu nhap: " + getThueThuNhap());
    }
}
