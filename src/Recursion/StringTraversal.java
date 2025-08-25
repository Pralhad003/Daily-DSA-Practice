package Recursion;

public class StringTraversal {
    public static void skip(int i, String s,String ans){
        if(i==s.length()) {
            System.out.println(ans);
            return;
        }
        if(s.charAt(i)!='a') ans+=s.charAt(i);
       // System.out.print(s.charAt(i));
        skip(i+1,s,ans);
    }
    public static void main(String[] args) {
        String S = "Pralhad bhusari";
       // String a;
        skip(0, S,"");
    }
}
