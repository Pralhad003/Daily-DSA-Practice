package Strings;
import java.util.*;
public class containss {
    static int cheak(String arr[],String s){
        int m=arr.length;
        int count=0;
        for(int i=0;i<m;i++) {
            if (s.contains(arr[i])) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("size of arr");
        int n=sc.nextInt();
        sc.nextLine();
        String arr[]=new String[n];
        for(int i=0;i<n;i++){
            //arr[i]=Integer.parseInt(sc.nextLine());
            arr[i]=sc.next();
        }
        sc.nextLine();
        System.out.println(Arrays.toString(arr));
        System.out.println("Enter the world size");
        String s=sc.nextLine();
        System.out.println( cheak(arr,s));
    }
}
