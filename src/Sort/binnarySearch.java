package Sort;

import java.util.Scanner;

public class binnarySearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={10 ,12, 15, 20,43,53,64,75};
        int n=arr.length;
        int lo=0;
        int hi=n-1;
        int target=sc.nextInt();
        boolean flag=false;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(arr[mid]==target) {
                flag = true;
                break;
            }
            else if(arr[mid]>target) hi=mid-1;
            else if(arr[mid]<target) lo=mid+1;
        }
        if(flag==true) System.out.println("it is found");
        else System.out.println("it is not found");

    }
}
