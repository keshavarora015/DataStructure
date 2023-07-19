package org.example.DataStructure.Array;

public class MaximumSubArray {
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }
    public static int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = nums[0];
        int startIndex = -1;
        int endIndex = -1;

        for(int i =1;i<nums.length ;i++){
            if(currSum<0)
                currSum = 0;
            currSum+=nums[i];
            maxSum = Math.max(maxSum,currSum);
        }

        return maxSum > 0 ? maxSum : 0;
    }
}
