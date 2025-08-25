package Sort;
import java.util.*;
public class kth_missing_number {
    public static int missingpositive(int arr[],int k){
        int h=arr.length;
        int l=0;
        while(l<=h){
            int mid=l+(h-l)/2;
            int missed=arr[mid]-(mid+1);
            if(missed<k) l=mid+1;
            else h=mid-1;
        }
        return k+l;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the n value");
        int z=sc.nextInt();
        int arr[]=new int[z];
        System.out.println("enter the size of  arr");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("enter the missing number");
        int k=sc.nextInt();
        System.out.println( missingpositive(arr,k));
    }

}

