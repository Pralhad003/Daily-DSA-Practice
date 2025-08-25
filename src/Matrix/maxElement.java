package Matrix;

import java.util.*;

public class maxElement {
    public static int[] printMax(int[][] arr){
        int[]res= new int[arr.length];
        for(int i=0;i<arr.length;i++){
            int maxval=Arrays.stream(arr[i]).max().getAsInt();
            res[i]=maxval;
        }
      return res;
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
        int []res=printMax(arr);
        for(int x:res){
            System.out.println(x);
        }
    }
}
