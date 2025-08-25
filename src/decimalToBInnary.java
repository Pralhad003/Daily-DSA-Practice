import java.util.*;
public class decimalToBInnary {
    public static void main(String[] args) {
        int n=8;
        String s="";
        while(n>0) {
            char ch = Integer.toString(n%2).charAt(0);
            s+=ch;
            n/=2;
        }
        String reversed = new StringBuilder(s).reverse().toString();
        System.out.println(reversed);
    }
}
