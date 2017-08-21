package algorithm;

import java.util.Collection;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

/**
 * Created by samuel.shao on 4/17/2017.
 */
public class SingleNumberThree {

    public static void main(String[] args) {
        int[] input = {1, 2, 1, 3, 2, 5};
        int[] result = singleNumber(input);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

    public static int[] singleNumber(int[] nums) {
        int[] result = new int[2];
        Set<Integer> set = new HashSet<>((nums.length - 2) / 2 + 2);
        for (int i = 0; i < nums.length; i++) {
            if (!set.add(nums[i])) {
                set.remove(nums[i]);
            }
        }
        Object[] resultArray = set.toArray();
        result[0] = (int) resultArray[0];
        result[1] = (int) resultArray[1];


        return result;
    }

}
