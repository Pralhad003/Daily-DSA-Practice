package Sort;

import java.util.Scanner;

public class insertionSort {
    static void print(int arr[]){
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    static void swap(int arr[], int i,int j){
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
        for(int i=1;i<n;i++){
            int j=i;
            while(j>=1 && arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                    j--;
            }
        }
        print(arr);
    }
}
