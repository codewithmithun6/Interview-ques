package Practice;
//find the sum of two number from given array and match given target value in java
// if array is already sorted

import java.util.Arrays;

public class Demo3 {

    public static int[] findTwoSum(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) { //{2, 7, 11, 15};
            int sum = nums[left] + nums[right];
            if (sum == target) {
                return new int[]{left, right};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[]{-1, -1}; // Return if no such pair found
    }
    public static void main(String[] args) {

        int[] nums = {2, 7, 11, 15};
        int target = 26;
        int[] result = findTwoSum(nums, target);
        System.out.println("Indices: " + Arrays.toString(result));



    }
}
