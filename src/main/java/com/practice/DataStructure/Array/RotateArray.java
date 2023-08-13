package com.practice.DataStructure.Array;

import com.practice.Print;

public class RotateArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        rotate(nums,3);
        Print print = new Print();
        print.print(nums);
    }

    /**
     *      1,2,3,4,5,6,7   K = 3
     *      Output: [5,6,7,1,2,3,4]
     *      ----------------------
     *      7,1,2,3,4,5,6  K=1
     *      6,7,1,2,3,4,5  K=2
     *      5,6,7,1,2,3,4  K=3
     *
     *      ------------------------------------------
     *      1,2,3,4,5,6,7
     *      reverse( length-k to length ) -> 1,2,3,4,7,6,5
     *      reverse( 0 to length-k ) -> 4,3,2,1,7,6,5
     *      reverse( 0 to length ) -> 5,6,7,1,2,3,4 -> ANS
     *
     * */

    private static void rotate(int[] nums, int k) {
        k=k%nums.length;
        reverseArray(nums,nums.length-k,nums.length-1);
        reverseArray(nums,0,nums.length-k-1);
        reverseArray(nums,0, nums.length-1);
    }

    private static void reverseArray(int[] nums, int i, int j) {
        while(j>i){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
}
