import java.util.*;
public class DictinctDigit {
   // n= 101 ,m=105 output is 102
    //101, 102, 103,104,105  find dictivt like all number are unique and first occur 101 is not unique like 1 is repeat
    // 102 is first occur unique digit
    static boolean isunique(int num){
        Set<Character>cheak=new HashSet<>();
        String s=Integer.toString(num);
        for(char ch:s.toCharArray()){
            if(cheak.contains(ch)){
                return false;
            }
            cheak.add(ch);
        }
        return true;
    }
    static int findDigit(int n,int m){
       for(int i=n;i<=m;i++){
          if(isunique(i)){
              return i;
          }
       }
       return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        System.out.println( findDigit(n,m));
    }
}
