package algorithm;

import java.util.Stack;

/**
 * Created by samuel.shao on 4/18/2017.
 */
public class MaxArea {

    public static void main(String[] args) {
        int[] input = {2, 1};
        System.out.println(maxArea(input));
    }

    public static int maxArea(int[] height) {
        int step = 0;
        int pointer1 = height[0];
        int lastPointer = 0;
        int lastHeight = height[height.length - 1];
        int result = 0;
        for (int i = 1; i < height.length; i++) {
            step++;
            if (height[i] > pointer1) {
                if (step * pointer1 > result) {
                    result = step * pointer1;
                }
                pointer1 = height[i];
                lastPointer = i;
                step = 0;
            }

        }
        int lastOne = lastHeight * (height.length - 1 - lastPointer);
        return result > lastOne ? result : lastOne;

    }
}
