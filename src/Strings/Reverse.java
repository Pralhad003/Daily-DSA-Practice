package Strings;
import java.util.*;
public class Reverse {
    public static void main(String[] args) {
        String s="PRALHAD";

        //USING REVERSE FUNCTION
//        StringBuilder res=new StringBuilder(s);
//        res.reverse();
//        String reverse=res.toString();

        //USING  FOR LOOP
//        String reverse="";
//        for(int i=s.length()-1;i>=0;i--){
//             reverse +=s.charAt(i);
//        }


        //USING CHAR ARRAY
        char[] chars=s.toCharArray();
        int  l=0;
        int r=chars.length -1;
        while(l<=r){
            char temp=chars[l];
            chars[l]=chars[r];
            chars[r]=temp;
            l++;
            r--;
        }
        //String reverse=new String(chars);
        System.out.println(chars);
    }
}
