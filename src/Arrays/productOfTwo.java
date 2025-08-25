package Arrays;
import java.util.*;
public class productOfTwo {
    static int printProduct(int arr[]){
        int n=arr.length;
        int maxp=0;
        int product=0;
        Arrays.sort(arr);
//        for(int i=0;i<n-1;i++){
////                for(int j=1;j<n;j++){
////                    product=arr[i]*arr[j] ;
////                }
//
//        }
        product=arr[n-2]*arr[n-1];
        maxp=arr[0]*arr[1];
        maxp=Math.max(maxp,product);
        return maxp;
    }
    public static void main(String[] args) {
        int arr[]={-1,-2,-3,4,1,5,9,-8,-9,9,10};
        System.out.println(printProduct(arr));
    }
}
