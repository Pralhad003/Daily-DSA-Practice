package Recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class generatePrarentheses {
    static List<String> ans;
    public static  void print(int open,int close, int n,String s){
        if(s.length()==2*n){
            ans.add(s);
            return;
        }
        if(open<n) print(open+1,close,n,s+"(");
        if(close<open) print(open,close+1,n,s+")");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
            ans=new ArrayList<>();
            print(0, 0, n,"");

        for (String s : ans) {
            System.out.println(s);
        }

        sc.close();
        }

    }

