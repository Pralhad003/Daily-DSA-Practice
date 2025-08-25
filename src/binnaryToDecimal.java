import java.util.*;
public class binnaryToDecimal {
    public static void main(String[] args) {
        String s = "1001";
        int n = s.length();
        int i;
        int sum=0;
        int p = 0;
        for (i = n-1; i >= 0; i--) {
            char ch = s.charAt(i);
          int b=Integer.parseInt(String.valueOf(ch));
            sum += b * Math.pow(2, p);
            p++;
        }
        System.out.println(sum);
    }

}
