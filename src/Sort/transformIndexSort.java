package Sort;

public class transformIndexSort {
    static void print(int arr[]){
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={40,12,74,54,100,27};
        int n=arr.length;
        int x=0;
        print(arr);
        for(int i=0;i<n;i++){
            int min=Integer.MAX_VALUE;
            int mindx=-1;
            for(int j=0;j<n;j++){
                if(arr[j]<min && arr[j]>0){
                    min=arr[j];
                    mindx=j;
                }
            }
            arr[mindx]=x;
            x--;
        }
        for(int i=0;i<n;i++){
            arr[i]*=(-1);
        }
        print(arr);
    }

    public static class Kth_missing_Number {
    }
}
