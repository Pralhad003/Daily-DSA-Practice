package Strings;
import java.util.*;
public class problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ip = sc.nextInt();
        String s = "";      //18       162

        while (ip>0){
            int count = 1;
            while(count*2<=ip){
                count*=2;
            }

            s+=Integer.toString(count);
            ip-=count;

        }

        System.out.println(s);
    }
}
