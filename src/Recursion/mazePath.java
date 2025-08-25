package Recursion;

import java.util.Scanner;

public class mazePath {
    static int maze(int row,int col,int m,int n){
        if(row==m||col==n)return 1;
        if(row==m&&col==n)return 1;
if(row>m||col>n) return 0;
        int right=maze(row,col+1,m,n);
        int left=maze(row+1,col,m,n);
        return right+left;

    }
//static int maze2(int row,int col){
//    if(row==1||col==1)return 1;
//    int right=maze2(row,col-1);
//    int left=maze2(row-1,col);
//    return right+left;
//
//}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the n :");
        int n=sc.nextInt();
        System.out.println("Enter the m :");
        int m=sc.nextInt();
       System.out.println("No.of Way->"+maze(1,1,m,n));
       // System.out.println("No.of Way->"+maze2(m,n));
    }
}
