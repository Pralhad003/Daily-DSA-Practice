package Matrix;

import java.util.Arrays;
import java.util.Scanner;

public class snakePattren {

    public static void printmatrix(int [][]arr){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }

    public static void print(int [][]arr){
        int n = arr.length;
        int m = arr[0].length;
        for(int i = 0; i < n; i++){
            if(i % 2 == 0){
                // left to right
                for(int j = 0; j < m; j++){
                    System.out.print(arr[i][j] + " ");
                }
            } else {
                // right to left
                for(int j = m - 1; j >= 0; j--){
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println(); // move to next line after each row
        }
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

        System.out.println("Snake Pattern:");
        print(arr);

        sc.close();
    }
}
