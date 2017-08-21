package algorithm;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by samuel.shao on 3/29/2017.
 */
public class FirstUniqueCharacter {

    public static void main(String[] args) {
        System.out.println(firstUniqChar(""));
    }


    public static int firstUniqChar(String s) {
        Map<String, Integer> map = new HashMap<>();
        int result = s.length();
        for (int i = 0; i < s.length(); i++) {
            String key = String.valueOf(s.charAt(i));
            if (map.containsKey(key)) {
                map.remove(key);
            } else {
                map.put(key, i);
            }
        }

        if (map.size() > 0) {
            Iterator<Map.Entry<String, Integer>> ite = map.entrySet().iterator();
            while (ite.hasNext()) {
                Map.Entry<String, Integer> item = ite.next();
                if (item.getValue() < result) {
                    result = item.getValue();
                }
            }
        } else {
            return -1;
        }

        return result;

    }
}
