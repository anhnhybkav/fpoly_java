package lab6;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String hoVaTen = sc.nextLine();
        // int firstIndex = hoVaTen.indexOf(" ");
        // int lastIndex = hoVaTen.lastIndexOf(" ");
        // String ho = hoVaTen.substring(0, firstIndex).toUpperCase();
        // String ten = hoVaTen.substring(lastIndex+1).toUpperCase();
        // hoVaTen = ho + hoVaTen.substring(firstIndex, lastIndex+1) + ten;
        System.out.println(chuanHoa(hoVaTen));
        sc.close();
    }


    // Ham chuan hoa ten
    public static String chuanHoa(String s) {
        StringBuilder sb = new StringBuilder();
        String words[] = s.trim().split("\\s+");
        for(String word : words) {
            sb.append(String.valueOf(word.charAt(0)).toUpperCase());
            sb.append(word.substring(1).toLowerCase());
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}
