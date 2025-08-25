package Recursion;

public class fibboSeries {
    static void printfibbo(int term,int a,int b){
        if(term>=0){
            System.out.println(a+" ");
           printfibbo(term-1,b,a+b);
        }
    }
    public static void main(String[] args) {
        int term=9;
        printfibbo(term,0,1);
    }
}
