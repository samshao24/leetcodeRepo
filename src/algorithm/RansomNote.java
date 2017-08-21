package algorithm;

import java.nio.IntBuffer;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;

/**
 * Created by samuel.shao on 4/11/2017.
 */
public class RansomNote {

    public static void main(String[] args) {
        String s1 = "aa";
        String s2 = "ab";
        System.out.println(canConstruct(s1, s2));
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        Map<String, Integer> target = new Hashtable<>();
        for (int i = 0; i < magazine.length(); i++) {
            Integer count = 1;
            String value = String.valueOf(magazine.charAt(i));
            if (target.containsKey(value)) {
                count = target.get(value);
                count++;
                target.remove(value);
            }
            target.put(value, count);
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            String source = String.valueOf(ransomNote.charAt(i));
            if (target.containsKey(source)) {
                Integer result = target.get(source);
                result--;
                target.remove(source);
                if (result > 0) {
                    target.put(source, result);
                }
            } else {
                return false;
            }
        }
        return true;
    }
}
