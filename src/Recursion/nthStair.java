package Recursion;

public class nthStair {
    static int stair(int n){
        if(n<0)return 0;
        if(n==0)return 1;
        return stair(n-1)+stair(n-3); //only jump 1 or 3;
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(  stair(n));
    }
}
