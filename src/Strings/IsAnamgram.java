package Strings;

import java.util.*;

public class IsAnamgram {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String t=sc.nextLine();

        Validation(s,t);
    }

    private static Boolean Validation(String s,String t) {
        char arr1[]=s.toCharArray();
        char arr2[]=t.toCharArray();
        if(s.length()!=t.length())return false;
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(Arrays.equals(arr1,arr2)) {
            return true;
        }
        else {
            return false;
        }
    }
}
