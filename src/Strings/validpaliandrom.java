package Strings;
import java.util.*;
public class validpaliandrom {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String r=s.toUpperCase();
        String c = r.replaceAll("[^A-Za-z0-9]",""); // Remove all spaces
        char arr[]=c.toCharArray();
        int i=0;
        int j=arr.length-1;
        System.out.println(validation(arr));

    }

    private static boolean validation(char[] arr) {
        int i=0;
        int j=arr.length-1;
        while(i<=j){
          if(arr[i]==arr[j])
          {
              i++;
              j--;
          } else return false;
        }
        return true;
    }
}
