package Strings;

public class RemoveDuplicate {
    public static String print(String s){
        StringBuilder arr=new StringBuilder();
        boolean[] seen =new boolean[26];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(!seen[ch-'a']){
              //boolean b = true;
                seen[ch-'a']= true;
                arr.append(ch);
            }
        }
        return arr.toString();

    }
    public static void main(String[] args) {
        String s="bcabc";
        System.out.println( print(s));
    }
}
