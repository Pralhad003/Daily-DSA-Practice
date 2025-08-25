package Arrays;
import java.util.*;
public class kRoate {
    static void rotate(int arr[],int k){
        int n=arr.length;
        int arr1[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            int x=(i-k+n)%n;
            arr1[x]=arr[i];
        }
        System.out.println(Arrays.toString(arr1));
    }
    public static void main(String[] args) {
        int []arr={10,20,30,40,50};
        int k=2;
        rotate(arr,k);
    }
}
