package Matrix;

import java.util.Arrays;
import java.util.Scanner;

public class TranpposeMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[][] = new int[n][m];
        for (int i = 0; i <n; i++) {
            for(int j=0;j<m;j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
        System.out.println("After tranpose the matrix");
        for(int j=0;j<m;j++){
            int []temp=new int[n];
            for(int i=0;i<n;i++){
                temp[i]=arr[i][j];

            }
            System.out.println(Arrays.toString(temp));        }
    }
}
