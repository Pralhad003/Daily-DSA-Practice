import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class maximumfruency {
    public static String solve1(String s) {
        int n = s.length();
        Map<Character, Integer> mp = new HashMap<>();

        // Count frequency of each character
        for (char ch : s.toCharArray()) {
            mp.put(ch, mp.getOrDefault(ch, 0) + 1);
        }

        int maxi = 0;

        // Find maximum frequency
        for (int val : mp.values()) {
            maxi = Math.max(maxi, val);
        }

        // Find lexicographically smallest among maximum frequency characters
        char ans = Character.MAX_VALUE;
        for (char ch : mp.keySet()) {
            if (mp.get(ch) == maxi) {
                ans = (char) Math.min(ans, ch);
            }
        }

        return String.valueOf(ans);
    }

    public static void main(String[] args) {
        List<String> inputByLine = new ArrayList<>();

        try {
            InputStreamReader isr = new InputStreamReader(System.in, "UTF-8");
            BufferedReader br = new BufferedReader(isr);

            String line;
            while ((line = br.readLine()) != null && !line.isEmpty()) {
                inputByLine.add(line);
            }

            // Process each input line
            for (String ip : inputByLine) {
                System.out.println(solve1(ip));
            }

            isr.close(); // closes System.in too
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
