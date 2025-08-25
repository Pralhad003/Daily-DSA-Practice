package Matrix;

import java.util.*;

public class increasingOrderMatrix {
    public static void printmatrix(int [][]arr){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }
    public static int[][] sortAll(int [][]arr){
        int []ar=new int[arr.length*arr.length];
        int k=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                ar[k++]=arr[i][j];
            }
        }
        Arrays.sort(ar);
        k=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                arr[i][j]=ar[k];
                k++;
            }
        }
            return arr;
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
        System.out.println("Matrix:");
        printmatrix(arr);

        sortAll(arr);
        printmatrix(arr);
    }
}
