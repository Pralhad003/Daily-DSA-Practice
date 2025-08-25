package Arrays;
import java.util.*;
public class segregate2 {
    public static void printsegregate2(int[] arr) {
        int n=arr.length;
        int lo=0;
        int mid=0;
        int hi=n-1;
        while(mid<=hi){
            if(arr[mid]==0){
                int temp=arr[mid];
                arr[mid]=arr[lo];
                arr[lo]=temp;
                lo++;
                mid++;
            }
            else if(arr[mid]==1) mid++;
            else{
                int temp=arr[mid];
                arr[mid]=arr[hi];
                arr[hi]=temp;
                hi--;
            }
        }

    }
    public static void main(String[] args) {
        int arr[]={1,0,2,1,1,2,0};
        printsegregate2(arr);
        System.out.println(Arrays.toString(arr));
    }


}

