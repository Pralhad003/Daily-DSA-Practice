import java.util.*;
public class SecondLargest {
    static int printSecond(int arr[]){
        int n=arr.length;
        int fmax=Integer.MIN_VALUE;
        int Smax=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>fmax)
            fmax=arr[i];
            if(Smax<arr[i] && arr[i]<fmax){
                Smax=arr[i];
            }
        }
        return Smax;
    }
    public static void main(String[] args) {
        int arr[] = {10, 10, 5, 5, 4, 4};
        System.out.println(printSecond(arr));
    }
}
