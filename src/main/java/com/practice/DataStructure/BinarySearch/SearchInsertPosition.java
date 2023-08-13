package com.practice.DataStructure.BinarySearch;

public class SearchInsertPosition {

    public static void main(String[] args) {
        System.out.println(searchInsert(new int[]{1,3,5,6},2));
        //the search inserted position will be the as lower bond
    }
    public static int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int ans = nums.length;
        while(low <= high){
            int mid = low + ((high - low)/2);
            if(nums[mid] >= target) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid +1;
            }
        }
        return ans;
    }
}
