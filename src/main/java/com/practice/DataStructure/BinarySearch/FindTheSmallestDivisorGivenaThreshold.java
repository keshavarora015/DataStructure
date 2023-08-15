package com.practice.DataStructure.BinarySearch;

import java.util.Arrays;

//Question :: https://leetcode.com/problems/find-the-smallest-divisor-given-a-threshold/

public class FindTheSmallestDivisorGivenaThreshold {
    public static void main(String[] args) {
        System.out.println(smallestDivisor(new int[]{44,22,33,11,1},5));
    }

    public static int smallestDivisor(int[] nums, int threshold) {
        int low = 1;
        int high = Arrays.stream(nums).max().getAsInt();
        int ans = high;
        while(low <= high){
            int mid = (low + high)/2;
            if(getSmallestDivisor(nums,mid) <= threshold ){
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    private static int getSmallestDivisor(int[] nums, int mid) {
        int tempThresh = 0;
        for(int i = 0; i<nums.length;i++){
            tempThresh += Math.ceil((double) nums[i]/(double) mid);
        }
        return tempThresh;
    }
}
