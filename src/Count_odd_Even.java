import java.util.*;
/*
input1: 5
Input2: (1,2,1,6,10,9)
Output: 2
Explanation: The given sequence which he has to write is 1->2->1->6->10->9 Below is the sequence of pen, the teacher has to use:
 */
public class Count_odd_Even {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int count=0;
        for(int i=0;i<n-1;i++){
            if(arr[i]%2!=0&&arr[i+1]%2==0){
                count++;
            }
        }
        System.out.println(count);
    }
}
