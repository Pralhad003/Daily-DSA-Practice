package Sort;

public class LowerBound {
    public static void main(String[] args) {
        int arr[]={10,20,30,30,40,40,50,60,70};
        int lo=0,hi=arr.length-1;
        int lb=arr.length-1;
        int x=30;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(arr[mid]>x){
                lb=Math.min(lb,mid);
                hi=mid-1;
            }
            else lo=mid+1;
        }
        System.out.println(lb);
    }
}
