package lab7.bai2_3_4;

public class SinhVienBiz extends SinhVienPoly { 
    private double diemMarketing;
    private double diemSales;

    public SinhVienBiz(String hoTen, String nganh, double diemMarketing, double diemSales) {
        super(hoTen, nganh);
        this.diemMarketing = diemMarketing;
        this.diemSales = diemSales;
    }

    @Override
    public double getDiem() {
        return (diemMarketing*2 + diemSales) / 3;
    }
}
