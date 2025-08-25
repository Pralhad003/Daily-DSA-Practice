package Recursion;

public class powerOfAB {
    static int pow(int n,int m){
        if(m==0)return 1;   // T.C O(m)
        return n*(pow(n,m-1));
    }
    static int pow2(int n,int m){
        if(m==0)return 1;
        int ans=pow2(n,m/2); ///   T.C log(m);
        if(m%2==0)return ans*ans;
        else return ans*ans*n;
    }
    public static void main(String[] args) {
        int n = 2;
        int m = 6;
        System.out.println( pow2(n, m));
    }
}
