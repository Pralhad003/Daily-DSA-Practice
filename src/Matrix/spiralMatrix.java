package Matrix;
import java.util.*;

public class spiralMatrix {

    static List<Integer> printSpiral(int arr[][]) {
        List<Integer> sp = new ArrayList<>();
        int n = arr.length;
        int m = arr[0].length;

        int top = 0, bottom = n - 1;
        int left = 0, right = m - 1;

        while (top <= bottom && left <= right) {

            // left → right
            for (int j = left; j <= right; j++) {
                sp.add(arr[top][j]);
            }
            top++;

            // top → bottom
            for (int i = top; i <= bottom; i++) {
                sp.add(arr[i][right]);
            }
            right--;

            if (top <= bottom) {
                // right → left
                for (int j = right; j >= left; j--) {
                    sp.add(arr[bottom][j]);
                }
                bottom--;
            }

            if (left <= right) {
                // bottom → top
                for (int i = bottom; i >= top; i--) {
                    sp.add(arr[i][left]);
                }
                left++;
            }
        }
        return sp;
    }

    public static void main(String[] args) {
        int arr[][] = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
        List<Integer> result = printSpiral(arr);
        System.out.println(result);
    }
}
