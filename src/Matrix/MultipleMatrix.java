package Matrix;

import java.util.Scanner;

public class MultipleMatrix {
    public static void Multiple(int[][]arr1,int[][]arr2,int[][]res){
        int n = arr1.length;
        int m = arr1[0].length;
        int a= arr2.length;
        int b= arr2[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<b;j++){
                res[i][j]=0;
                for(int k=0;k<m;k++){
                    res[i][j]+=arr1[i][k]*arr2[k][j];
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a= sc.nextInt();
        int b= sc.nextInt();
        int arr1[][] = new int[n][m];
        int arr2[][]=new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < a; i++) {
            for (int j = 0; j <b; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }
        int res[][]=new int[n][b];
        Multiple(arr1,arr2,res);
        System.out.println("Multiplication of given two matrices is:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(res[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
