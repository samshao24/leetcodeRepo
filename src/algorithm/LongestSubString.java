package algorithm;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by samuel.shao on 4/17/2017.
 */
public class LongestSubString {

    public static void main(String[] args) {
        String s = "dvdf";
        System.out.println(lengthOfLongestSubstring(s));
    }


    public static int lengthOfLongestSubstring(String s) {
        Queue<String> queue = new LinkedList<>();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (queue.contains(String.valueOf(s.charAt(i)))){
                if (queue.size() > count) {
                    count = queue.size();
                }
                while(queue.peek() != null) {
                    String temp = queue.peek();
                    queue.poll();
                    if (temp.equals(String.valueOf(s.charAt(i)))) {
                        break;
                    }
                }
                queue.add(String.valueOf(s.charAt(i)));
            } else {
                queue.add(String.valueOf(s.charAt(i)));
            }
        }
        return queue.size() > count ? queue.size() : count;
    }
}
