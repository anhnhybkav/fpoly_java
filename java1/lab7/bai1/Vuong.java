package lab7.bai1;

public class Vuong extends ChuNhat{

    public Vuong(double canh) {
        super(canh, canh);
    }
    
    public void xuat() {
        System.out.println("Canh = " + rong);
        System.out.println("Chu vi = " + getChuVi());
        System.out.println("Dien tich = " + getDienTich());
    }
}
