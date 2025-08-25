package Arrays;
import java.util.*;

public class colorCode {
    static List<Integer> printcolor(int[] arr) {
        int n = arr.length;
        List<Integer> zero = new ArrayList<>();
        List<Integer> ones = new ArrayList<>();
        List<Integer> two = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                zero.add(arr[i]);
            } else if (arr[i] == 1) {
                ones.add(arr[i]);
            } else if (arr[i] == 2) {
                two.add(arr[i]);
            }
        }
        List<Integer> re = new ArrayList<>();
        re.addAll(zero);
        re.addAll(ones);
        re.addAll(two);

        return re;
    }

    public static void main(String[] args) {
        int arr[] = {0, 1, 0, 1, 2, 1, 0, 2, 0, 1};
        List<Integer> result = printcolor(arr);
        System.out.println(result);
    }
}
