package Sort;

import java.util.Scanner;

public class SelectionSort {
    static void print(int arr[]){
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        print(arr);
        for(int i=0;i<n-1;i++){
            int min=Integer.MAX_VALUE;
            int mindx=-1;
            for(int j=i;j<n;j++){
                if (arr[j]<min){
                    min=arr[j];
                    mindx=j;
                }
            }
            swap(arr,i,mindx);
        }
        print(arr);
    }
}
