package Arrays;
import java.util.*;
public class sumArrayreverse {
    static int[] reversea(int[] arr){
        int n=arr.length;
        int m=n/2;
        int sum1=0;
        int sum2=0;
        for(int i=0;i<n;i++){
            if(i<m){
                sum1+=arr[i];
            }
            else{
                sum2+=arr[i];
            }
        }
        if(sum2>sum1){
            int i=0;
            int j=n-1;
            while(i<j){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(reversea((arr))));
    }
}
