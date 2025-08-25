package Strings;
import java.util.*;
public class LuckyNumber {
    static int sumOfString(String s){
        int n=s.length();
        int lc=0;
        for(int i=0;i<n;i++) {
            int index=i+1;
            int ascii = (int) s.charAt(i);
            if(i%2==1||ascii%2==1){
                lc+=(index*ascii);
            }
        }
        return lc;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(sumOfString(s));
    }
}
