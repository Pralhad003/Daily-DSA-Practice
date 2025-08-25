package Recursion;

import java.util.ArrayList;

public class Subset {
    static ArrayList<String> arr=new ArrayList<>();
    public static void printSubset(int i,String s,String ans){
       // static ArrayList<String>arr=new ArrayList<>();
        if(i==s.length()){
            arr.add(ans);
            return;
        }
        char ch=s.charAt(i);
        printSubset(i+1,s,ans);
        printSubset(i+1,s,ans+ch);

    }
    public static void main(String[] args) {
        String s="abc";
        printSubset(0,s,"");
        System.out.println(arr);
    }
}
