package Matrix;

import java.util.Arrays;
import java.util.Scanner;
public class RoateClockWise {
    public static void Clockwise(int n,int m,int[][]arr){
        int  r=0,c=0;
        int prev,curr;
        while(r<n&&c<m) {           //1 2 3
            if (r + 1 == n || c + 1 == m)      //4 5 6
                break;              //7 8 9
            prev = arr[r + 1][c];
            //left to right
            for (int i = c; i < m; i++) {  //4 1 2
                curr = arr[r][i];        //prev=3
                arr[r][i] = prev;
                prev = curr;
            }
            r++;
            //top to buttom
            for (int i = r; i < n; i++) {    //  2
                curr = arr[m - 1][i];    //  3
                arr[m - 1][i] = prev;    //  6   prev=9
                prev = curr;
            }
            m--;
            //right to left
            if(r<n){
            for (int i = m - 1; i >= c; i--) { // 8 9 6
                curr = arr[n - 1][i];  //prev= 6
                arr[n - 1][i] = prev;
                prev = curr;
            }
        }
            n--;
            //buttom to top
            if(c<m) {
                for (int i = n - 1; i >= r; i--) {
                    curr = arr[i][c];
                    arr[i][c] = prev;
                    prev = curr;
                }
            }
            c++;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
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
        for (int i = 0; i < n; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
        Clockwise(n,m,arr);
    }
}
