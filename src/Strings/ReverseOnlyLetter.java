package Strings;
import java.util.*;
public class ReverseOnlyLetter {
    public static boolean isenglish(char c){

        return ('a'<=c&&c<='z')||('A'<=c&&c<='Z');
    }
    public static String reverse(String s) {
        int i = 0;
        int j = s.length() - 1;
        char arr[] = s.toCharArray();
        while (i < j) {
            while(i < j && !isenglish(arr[i])) {
                i++;
            }
            while (i < j && !isenglish(arr[j])) {
                    j--;
                }
                if (i < j) {
                    char temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    i++;
                    j--;
                }
            }
            return new String(arr);
        }
        public static void main (String[]args){
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine(); // use nextLine() to allow spaces
            String result = reverse(s);
            System.out.println("Reversed only letters: " + result);
        }
    }
