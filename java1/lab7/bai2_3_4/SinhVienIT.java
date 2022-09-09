package lab7.bai2_3_4;

public class SinhVienIT extends SinhVienPoly {
    private double diemJava;
    private double diemCss;
    private double diemHtml;

    public SinhVienIT(String hoTen, String nganh, double diemJava, double diemCss, double diemHtml) {
        super(hoTen, nganh);
        this.diemJava = diemJava;
        this.diemCss = diemCss;
        this.diemHtml = diemHtml;
    }

    @Override
    public double getDiem() {
        return (diemJava*2 + diemCss + diemHtml) / 4;
    }

}
