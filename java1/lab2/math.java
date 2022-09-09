package lab2;

public class math {
    public static void phuongTrinhBacNhat(double a, double b) {
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phuong trinh vo so nghiem");
            } else {
                System.out.println("Phuong trinh vo nghiem");
            }
        } else {
            System.out.println("Phuong trinh co nghiem x = " + -b / a);
        }
    }

    public static void phuongTrinhBacHai(double a, double b, double c) {
        double delta = Math.pow(b, 2) - 4 * a * c;
        if (delta < 0) {
            System.out.println("Phuong trinh vo nghiem");
        } else if (delta == 0) {
            System.out.println("Phuong trinh co nghiem kep x = " + -b / 2 * a);
        } else {
            System.out.printf("Phuong trinh co 2 nghiem phan biet x1 = %f, x2 = %f",
                    ((-b - Math.sqrt(delta)) / (2 * a)), ((-b + Math.sqrt(delta)) / (2 * a)));
        }
    }

    public static void tinhTienDien(int soDien) {
        long tienDien;
        if(soDien < 50) {
            tienDien = soDien * 1000;
        } else {
            tienDien = soDien * 1000 + (soDien - 50) * 1200;
        }
        System.out.printf("tien Dien thang nay la: %d vnd", tienDien);
    }
}
