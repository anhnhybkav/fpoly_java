package lab7.bai2_3_4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        SinhVienPoly svBiz1 = new SinhVienBiz("huyen", "mar", 4, 5);
        SinhVienPoly svIT = new SinhVienIT("jae", "cntt", 10, 10, 10);
        SinhVienPoly svBiz2 = new SinhVienBiz("anh", "mar", 9, 7);

        ArrayList<SinhVienPoly> list = new ArrayList<>();
        list.add(svBiz1);
        list.add(svIT);
        list.add(svBiz2);

        // // xuat danh sach sinh vien hoc luc gioi
        // for(SinhVienPoly sPoly : list) {
        //     if(sPoly.getHocLuc().equalsIgnoreCase("gioi")) {
        //         sPoly.xuat();
        //     }
        // }

        // sap xep danh sach theo diem
        Comparator<SinhVienPoly> comp = new Comparator<SinhVienPoly>() {

            @Override
            public int compare(SinhVienPoly sv1, SinhVienPoly sv2) {
                return sv1.getDiem() < sv2.getDiem() ? 1 : -1;
            }
            
        };
        Collections.sort(list, comp);
        // xuat danh sach sinh vien
        for(SinhVienPoly sPoly : list) {
            sPoly.xuat();
        }
    }
}
