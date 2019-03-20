/**
March 19, 2019

Given an integer array, find three numbers whose product is maximum and output the maximum product.

**/

public class maxProducts {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        return Math.max(nums[0] * nums[1] * nums[nums.length - 1], nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3]);
    }
}

/**
Correct answer: Yes
**/
