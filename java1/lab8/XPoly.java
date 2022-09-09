package lab8;

final public class XPoly {
    public static final double sum(double... x) {
        double sum = 0;
        for(int i = 0; i < x.length; i++) {
            sum += x[i];
        }
        return sum;
    }

    public static double min(double... x) {
        double min = x[0];
        for(int i = 1; i < x.length; i++) {
            if(min > x[i]) {
                min = x[i];
            }
        }
        return min;
    }

    public static double max(double... x) {
        double max = x[0];
        for(int i = 1; i < x.length; i++) {
            if(max < x[i]) {
                max = x[i];
            }
        }
        return max;
    }

    public static String toUpperFirstClass(String s) {
        StringBuilder sb = new StringBuilder();
        String[] words = s.trim().split("\\s+");
        for(String word : words) {
            sb.append(String.valueOf(word.charAt(0)).toUpperCase());
            sb.append(word.substring(1).toLowerCase());
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}
