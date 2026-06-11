import java.util.*;

public class EqualZeroOneSubstring {
    public static int longestSubstring(String s) {
        Map<Integer, Integer> map = new HashMap<>();
        int balance = 0, maxLen = 0;
        map.put(0, -1); 

        for (int i = 0; i < s.length(); i++) {
            balance += (s.charAt(i) == '0') ? -1 : 1;

            if (map.containsKey(balance)) {
                maxLen = Math.max(maxLen, i - map.get(balance));
            } else {
                map.put(balance, i);
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        String s = "11000110";
        System.out.println("Length of longest substring: " + longestSubstring(s));
    }
}
