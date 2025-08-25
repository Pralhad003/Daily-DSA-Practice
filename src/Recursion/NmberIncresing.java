package Recursion;

public class NmberIncresing {
    static void aftercall(int n){
        if(n==0) return ;
        System.out.println(n);
        aftercall(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        int n=5;
        aftercall(n);
    }
}
