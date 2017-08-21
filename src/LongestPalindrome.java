import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by samuel.shao on 3/15/2017.
 */
public class LongestPalindrome {

    public static void main(String[] args) {
       System.out.println(longestPalindrome("bananas"));
    }

    public static int longestPalindrome(String s) {
        int counter = 0;
        boolean single = false;
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            String a = String.valueOf(s.charAt(i));
            if (map.containsKey(a)) {
                Integer value = map.get(a);
                if (value % 2 == 1) {
                    counter++;
                } else {
                    if (!single) {
                        counter++;
                        single = true;
                    }
                }
                map.put(a, ( map.get(a)) + 1);

            } else {
                map.put(a, 1);
                if (!single) {
                    counter++;
                    single = true;
                }
            }
        }

        return counter;
    }
}
