package Arrays;

import java.util.Scanner;

public class subarrayAddition {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={1,2,1,3,5,2,4,2};
        int n=arr.length;
        int count=0;
        for(int i=0;i<=n-3;i++) {
            int a = arr[i] + arr[i + 2];
            if (arr[i + 1] == a) {
                count++;
            }
        }
        System.out.println(count);
        }
    }
