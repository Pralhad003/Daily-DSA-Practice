package Sort;
import org.w3c.dom.ls.LSOutput;

import java.util.*;
public class MaxiProduct_of_Store {
    public static  int minmax(int n,int arr[]){
        int m=arr.length;
        int mx=Integer.MIN_VALUE;
        for(int i=0;i<m;i++){
            mx=Math.max(mx,arr[i]);
        }
        int l=1;
        int h=mx;
        int ans=0;
        while(l<=h){
            int mid=l+(h-l)/2;
            int store=0;
            for(int i=0;i<arr.length;i++){
                if(arr[i]%mid==0) store+=arr[i]/mid;
                else store+=arr[i]/mid+1;
                System.out.println(store);
            }
            if(store<=n) {
                ans = mid;
                h = mid - 1;
            }
            else l=mid+1;
        }
return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("enter the n value");
        n=sc.nextInt();
        int z=sc.nextInt();
        int arr[]=new int[z];
        System.out.println("enter the size of  arr");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println(Arrays.toString(arr));
        System.out.println(minmax(n,arr));

    }

}
