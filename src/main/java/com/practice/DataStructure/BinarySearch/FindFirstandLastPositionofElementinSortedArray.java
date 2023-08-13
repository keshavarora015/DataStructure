package com.practice.DataStructure.BinarySearch;

public class FindFirstandLastPositionofElementinSortedArray {
    public static void main(String[] args) {
        int[] ans = searchRange(new int[]{5,7,7,8,8,10},8);
    }
    public static int[] searchRange(int[] nums, int target) {
        int first = findFirstPosition(nums,target);
        if(first == nums.length || nums[first] != target){
            return new int[]{-1,-1};
        }
        int last = findLastPosition(nums,target)-1;
        System.out.println(first+" "+last);
        return new int[]{first,last};
    }

    private static int findLastPosition(int[] nums, int target) {
     //upper bound
        int low = 0;
        int high = nums.length - 1;
        int ans = nums.length;

        while(low <= high){
            int mid = low + ((high - low)/2);
            if(nums[mid] > target){
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    private static int findFirstPosition(int[] nums, int target) {
        //lower bound
        int low = 0;
        int high = nums.length - 1;
        int ans = nums.length;

        while(low <= high){
            int mid = low + ((high - low)/2);
            if(nums[mid] >= target){
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
}
