package Matrix;

import java.util.Arrays;
import java.util.Scanner;

public class Rotate90 {
    public static void printmatrix(int [][]arr){
        int n=arr.length;
        int m=arr[0].length;
        for (int i = 0; i < n; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }
    public static int[][] rotate(int [][]arr){
        int n=arr.length;
        int m=arr[0].length;
        int [][]newarr= new int[m][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                newarr[j][n-1-i]=arr[i][j];
            }
        }
        return newarr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        printmatrix(arr);
        arr=rotate(arr);
        System.out.println("---------------------------------------------");
        printmatrix(arr);
    }
}
