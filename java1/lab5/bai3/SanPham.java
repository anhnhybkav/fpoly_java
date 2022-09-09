package lab5.bai3;

public class SanPham implements Comparable<SanPham> {
    private String name;
    private double gia;

    public SanPham(String name, double gia) {
        this.name = name;
        this.gia = gia;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    @Override
    public int compareTo(SanPham o) {
        return this.gia < o.gia ? 1 : -1;
    }

    public String toString() {
        return "ten: " + name + ", gia: " + gia;
    }
}
