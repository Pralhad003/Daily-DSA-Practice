package Sort;

public class kthSmallest {
    public static void print(int arr[]){

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static int ans=0;
    public static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static int partition(int[] arr, int lo, int hi){
        int mid=(lo+hi)/2;
        int pivot=arr[mid],pdx=mid;
        int smallcount=0;
        for(int i=lo;i<=hi;i++){
            if(i==mid)continue;
            if(arr[i]<=pivot)smallcount++;

        } int cIndex=pdx+smallcount;
swap(arr,pdx,cIndex);
 int i=lo,j=hi;
while(i<cIndex&&j>cIndex){
    if(arr[i]<pivot) i++;
    else if(arr[j]>pivot) j--;
    else if(arr[i]>pivot&&arr[j]<pivot){
        swap(arr,i,j);
        i++;
                j--;
    }

}
        return cIndex;
    }
    public static void Quickselect(int arr[],int lo,int hi,int k){
        if(lo>hi)return;
       int idx= partition(arr,lo,hi);
       if(idx==k-1){
           ans=arr[idx];
           return;
       }
      if(k-1<idx) Quickselect(arr,lo,idx-1,k);
       else Quickselect(arr ,idx+1,hi,k);
    }
    public static void main(String[] args) {
        int arr[]={3,1,6,7,4,5,9,8,2};
        int n=arr.length;
        int lo=0,hi=n-1;
        ans=-1;
        int k=2;
        print(arr);
        Quickselect(arr,lo,hi,n-k+1);     //n-k+1 second largetest element
        System.out.println(ans);//k-1 second smallest element

    }
}
