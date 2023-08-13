package com.practice.DataStructure.Array;

import com.practice.Print;

import java.util.ArrayList;
import java.util.List;

public class FindAllNumbersDisappearedInArray {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        List<Integer> ans = findDisappearedNumbers(nums);
        Print print = new Print();
        print.print(ans);
    }
    /**
     *
     *      [4,3,2,7,8,2,3,1]
     *
     *       ----------------------------------------
     *      | 4  |  3 |  2 |  7 |  8 | 2  | 3  | 1  |
     *      --0----1----2----3----4----5----6----7--
     *
     *     i=0   nums[0] = 4 -> index = 4-1 = *(-1)
     *                          index = 3
     *                          nums[3] = nums[3]*-1;
     *
     * */

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        for (int i =0 ;i< nums.length;i++){
            int index = Math.abs(nums[i])-1;
            if(nums[index]<0)
                continue;

            nums[index] = nums[index] * -1;
        }

        for (int i =0 ;i< nums.length;i++){
            if(nums[i]>0){
               ans.add(i+1);
            }
        }
        return ans;
    }
}
