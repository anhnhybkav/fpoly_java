import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        NhanVien a = new NhanVien("1", "jae", 18, 1000);
        NhanVien b = new NhanVien("2", "anh", 18, 2000);
        NhanVien c = new NhanVien("3", "h", 18, 3000);

        File filename = new File("java2/lab3/nhanvien.txt");
        try {
            FileWriter out = new FileWriter(filename);
            out.write(a.toString());
            out.write("\n");
            out.write(b.toString());
            out.write("\n");
            out.write(c.toString());
            out.write("\n");
            out.close();
            //DOC TU FILE TEXT
            FileReader input = new FileReader(filename);
            System.out.println("Doc tu file first.txt:");
            int ch = input.read();
            while (ch != -1) {
                System.out.print((char) ch);
                ch = input.read();      //DOC TU FILE
            }
        } catch (Exception e) {
            System.out.println("Co loi: " + e);
        }


        // FileOutputStream fos = new FileOutputStream("java2/lab3/nhanvien.bin");
        // ObjectOutputStream oos = new ObjectOutputStream(fos);
        // NhanVien[] nhanviens = {a, b, c};
        // oos.writeObject(nhanviens);
        // FileInputStream fis = new FileInputStream("java2/lab3/nhanvien.bin");
        // ObjectInputStream ois = new ObjectInputStream(fis);
        // NhanVien[] nhanViens1 = (NhanVien[]) ois.readObject();
        // for(NhanVien nhanVien : nhanViens1) {
        //     System.out.println(nhanVien);
        // }
    }
}
