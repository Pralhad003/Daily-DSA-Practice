package Arrays;
import java.util.*;
public class findDuplicate {
    public static List<Integer> find(int arr[]){
        List<Integer>res=new ArrayList<>();
        int n=arr.length;
        for(int i=0;i<n;i++){
            int idx=Math.abs(arr[i])-1;
            if(arr[idx]<0){
                res.add(Math.abs(arr[i]));
            }else{
                arr[idx]=-arr[idx];
            }
        }
        return res;
    }
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++) {
        arr[i]=sc.nextInt();
    }
        System.out.println(Arrays.toString(arr));
        List<Integer> duplicates = find(arr);
        System.out.println("Duplicates found: " + duplicates);
        sc.close();

    }
}
