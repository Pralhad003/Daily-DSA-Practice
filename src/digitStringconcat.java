import java.util.*;
public class digitStringconcat {
    static String solve(String s){
        StringBuilder digit=new StringBuilder();
        StringBuilder letter=new StringBuilder();
        if(Character.isDigit(s.charAt(0))){
            digit.append(s.charAt(0));
        }else{
            letter.append(s.charAt(0));
        }
        for(int i=1;i<s.length();i++){
            if(Character.isDigit(s.charAt(i-1))&&Character.isLetter(s.charAt(i))){
               digit.append(s.charAt(i-1));
            }
            if(Character.isLetter(s.charAt(i-1))&&Character.isDigit(s.charAt(i))){
                letter.append(s.charAt(i-1));
            }
        }
     return letter.toString()+ digit.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //intput->ABC120FME0000Z3MB1Y3C45
        //OUTPUT-ACEZBYC00313
        String s = sc.nextLine();
        System.out.println(  solve(s));
          }
        }
