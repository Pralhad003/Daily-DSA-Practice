package Strings;
import java.util.*;
public class countPermutation {
    static int  countMissing(int arr[],int n){
       Set<Integer>ans=new HashSet();
        Arrays.sort(arr);
        int count=0;
        for(int num :arr){
            ans.add(num);
        }
        for(int i=1;i<=n;i++){
            if(!ans.contains(i)){
                count++;
            }
        }

       return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println(countMissing(a,n));
    }
}
