package Arrays;
import java.util.*;

public class non_repeating_element {

    public static int printNonRepeating(int[] arr) {
        int n = arr.length;
        for(int i=0;i<n;i++){
            boolean repated=false;
            for(int j=0;j<n;j++){
                if(i!=j&&arr[i]==arr[j]){
                    repated=true;
                    break;
                }
            }
            if(!repated){
                return arr[i];
            }
        }

return 0;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println( printNonRepeating(arr));
    }
}
