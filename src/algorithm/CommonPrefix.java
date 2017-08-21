package algorithm;


import java.util.HashSet;
import java.util.Set;

public class CommonPrefix {

    public static void main(String[] args) {

    }

    public static String longestCommonPrefix(String[] strs) {
        String result = "";
        int pointer = 0;
        boolean end = false;
        while (true) {
            Set<String> letterSet = new HashSet<>();
            for (String s : strs) {
                if (s.length() <= pointer) {
                    letterSet.add(String.valueOf(s.charAt(pointer)));
                } else {
                    end = true;
                    break;
                }
            }
            if (end) {
                return result;
            } else {
               if (letterSet.size() == 1) {
                   result += letterSet.toArray()[0];
               }
            }
        }
    }


}
