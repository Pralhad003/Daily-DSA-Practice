package Sort;

public class QuickSort {
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
        int pivot=arr[lo],pivotIndex=lo;
        int smallcount=0;
        for(int i=lo+1;i<=hi;i++){
            if(arr[i]<pivot)smallcount++;

        }
        int currentIndex=pivotIndex+smallcount;
        swap(arr,pivotIndex,currentIndex);
        int i=lo,j=hi;
        while(i<currentIndex&&j>currentIndex){
            if(arr[i]<=pivot){
                i++;
            }else if(arr[j]>=pivot){
                j--;
            }else if(arr[i]>pivot&&arr[j]<=pivot){
                swap(arr,i,j);
                i++;
                j--;
            }
        }
        return currentIndex;

    }
    public static void Quicksort(int []arr,int lo,int hi){
        if(lo>=hi)return ;
       int idx= partition(arr,lo,hi);
       Quicksort(arr,lo,idx-1);
       Quicksort(arr,idx+1,hi);
    }
    public static void main(String[] args) {
        int arr[]={3,1,6,7,4,5,9,8,2};
        int n=arr.length;
        int lo=0,hi=n-1;
        print(arr);
      Quicksort(arr,lo,hi);
      print(arr);
    }
}
