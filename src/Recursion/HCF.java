package Recursion;
import java.util.*;
public class HCF {
    public static int printhcf(int a, int b){
        for(int i=Math.max(a,b);i>=1;i--){
            if(a%i==0&&b%i==0) return i;
        }
        return 1;
    }
    public static int printgcd(int a,int b){
        if(b%a==0)return a;
        return printgcd(b%a,a);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 1st no");
        int a=sc.nextInt();
        System.out.println("Enter the 2nd no");
        int b=sc.nextInt();
       // System.out.println(printhcf(a,b));
        System.out.println(printgcd(a,b));
    }
}
