package Strings;

import java.util.ArrayList;

public class VowelofallString {
    static boolean isvowel(char ch){
        return ch=='a'||ch=='i'||ch=='e'||ch=='o'||ch=='u';
    }
    public static long printarr(String s){
        int len=s.length();
        int count=0;
        for(int i=0;i<len;i++){
            if(isvowel(s.charAt(i))){
              count+=(long)(len-i)*(long)(i+1);
            }
        }
        return count;
    }
    public static  void main(String[] args) {
        String s="abaei";

        System.out.println(printarr(s));


    }
}
