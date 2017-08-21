package algorithm;

import java.util.Hashtable;
import java.util.Map;

/**
 * Created by samuel.shao on 4/19/2017.
 */
public class FirstMissingPositive {

    public static void main(String[] args) {
        int[] input = {2,1};
        System.out.println(firstMissingPositive(input));

    }

    public static int firstMissingPositive(int[] nums) {
        int downFlag = Integer.MAX_VALUE;
        int upFlag = 1;
        if (nums.length == 0) {
            return 1;
        }

        for (int i = 0; i < nums.length ; i++) {
            if (nums[i] < 0) {
                continue;
            }
            if (nums[i] < downFlag) {
                downFlag = nums[i] - 1;
                upFlag = nums[i] + 1;
                continue;
            }
            if (nums[i] > upFlag) {
                if (nums[i] == upFlag + 1) {
                    upFlag += 2;
                } else {
                    upFlag++;
                }
                continue;
            }
        }
        if (downFlag <= 0) {
            return upFlag;
        } else {
            return downFlag;
        }
    }
}
