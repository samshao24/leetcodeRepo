package algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by samuel.shao on 8/15/2017.
 */
public class ThreeSum {

    public static void main(String[] args) {
        int[] inputArray = {-1, 0, 1, 2, -1, -4};
        System.out.print(threeSum(inputArray).size());
    }


    public static List<List<Integer>> threeSum(int[] nums) {
        List<TwoSum> twoSumList = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                TwoSum twoSum = new TwoSum();
                twoSum.setSum(nums[i] + nums[j]);
                twoSum.setValue1(nums[i]);
                twoSum.setValue2(nums[j]);
                twoSum.setPos1(i);
                twoSum.setPos2(j);
                if (!twoSumList.contains(twoSum)) {
                    twoSumList.add(twoSum);
                }
            }
        }

        List<List<Integer>> resultList = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            for (TwoSum twoSum : twoSumList) {
                if (twoSum.getPos1() != i && twoSum.getPos2() != i && (twoSum.getSum() + nums[i] == 0)) {
                    List<Integer> output = new ArrayList<>();
                    output.add(nums[twoSum.getPos1()]);
                    output.add(nums[twoSum.getPos2()]);
                    output.add(nums[i]);
                    resultList.add(output);
                }
            }
        }
        return resultList;


    }

    static class TwoSum {
        int pos1;
        int value1;
        int pos2;
        int value2;
        int sum;

        public TwoSum() {
        }

        public int getValue1() {
            return value1;
        }

        public void setValue1(int value1) {
            this.value1 = value1;
        }

        public int getValue2() {
            return value2;
        }

        public void setValue2(int value2) {
            this.value2 = value2;
        }

        public int getPos1() {
            return pos1;
        }

        public void setPos1(int pos1) {
            this.pos1 = pos1;
        }

        public int getPos2() {
            return pos2;
        }

        public void setPos2(int pos2) {
            this.pos2 = pos2;
        }

        public int getSum() {
            return sum;
        }

        public void setSum(int sum) {
            this.sum = sum;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            TwoSum twoSum = (TwoSum) o;

            if ((value1 == twoSum.value1 && value2 == twoSum.value2)
                    || (value1 == twoSum.value2 && value2 == twoSum.value1)) return true;
            return false;
        }

        @Override
        public int hashCode() {
            return pos1 + pos2;
        }
    }
}
