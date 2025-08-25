package Recursion;

public class fibboNumber {
    static int fibbo(int n){
        if(n<=1) {
            //return n;
           // System.out.print(n);
            return n;
        }
        return fibbo(n-1)+fibbo(n-2);
    }
    public static void main(String[] args) {
        int n=9;
        System.out.println(fibbo(n));
    }
}
