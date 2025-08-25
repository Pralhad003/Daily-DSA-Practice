package Arrays;
import java.util.*;
public class sagregate {
    public static void printsegregate(int arr[]){
        int n=arr.length;
        int zero=0,ones=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0) zero++;
            if(arr[i]==1)ones++;
        }
        for(int i=0;i<n;i++){
            if(i<zero)arr[i]=0;
            else if(i<zero+ones)arr[i]=1;
            else arr[i]=2;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
//        7-----------Value of N
//[1,0,2,0,1,0,2]-> Element of arr[0] to arr[N-1], while input each element is separated by new
//                line
//        Output:
//        0 0 0 1 1 2 2 ->
        int arr[]={1,0,2,0,1,0,2};
        printsegregate(arr);
    }
}
