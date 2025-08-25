package SlidingWindow;
import java.util.*;
//Input  : arr[] = [100, 200, 300, 400],  k = 2
//Output : 700
public class maxKsum {
    public static int sumArray(int []arr,int k){
        int n=arr.length;
        int maxSum=Integer.MIN_VALUE;
//        for(int i=0;i<n-k+1;i++){
//            int sum=0;
//            for(int j=i;j<i+k;j++){
//                sum+=arr[j];
//            }
//
//            maxSum=Math.max(maxSum,sum);
//        }
        int sum=0;
        int index=0;
        while(index<n&&index<k) {
            sum += arr[index];
            index++;
        }
        maxSum=sum;
        for(int i=1;i<n-k+1;i++){
            int pre=arr[i-1];
            int next=arr[i+k-1];
            sum=sum-pre+next;
            maxSum=Math.max(maxSum,sum);
        }

        return maxSum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=3;
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(sumArray(arr,k));
    }
}
