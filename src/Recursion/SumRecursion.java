package Recursion;

public class SumRecursion {
    static void allSum(int n,int sum){
     if(n==0){
         System.out.println(sum);
         return;
     }
        allSum(n-1,sum+n);
    }
    public static void main(String[] args) {
        int n=7;
       allSum(n,0);
    }
}
