package Sort;

public class QuickSort2 {
    public static void swap(int []arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void print(int []arr){
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static int partition(int arr[],int lo,int hi){
        int i=lo-1;
        int pivot=arr[hi];
        for(int j=lo;j<=hi-1;j++){
            if(arr[j]<=pivot){
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,hi);
        return i+1;
    }
    public static void Quick(int arr[],int lo,int hi) {
     if(lo<hi){
       int idx=  partition(arr,lo,hi);
        Quick(arr,lo,idx-1);
        Quick(arr,idx+1,hi);
     }
    }
    public static void main(String[] args) {
        int arr[]={3,1,6,7,4,5,9,8,2};
        int n=arr.length;
        int lo=0,hi=n-1;
        print(arr);
        Quick(arr,lo,hi);
        print(arr);
    }
    }

