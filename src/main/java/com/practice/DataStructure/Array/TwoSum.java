package com.practice.DataStructure.Array;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] array = {2,7,11,15};
        int []ans = twoSum(array,9);
        for (int value : ans){
            System.out.print(value+" ");
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        // i cant sort bcz index return karna hai
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i< nums.length;i++){
            if(map.containsKey(target-nums[i])){
                ans[0] = i;
                ans[1] = map.get(target-nums[i]);
            }
            map.put(nums[i],i);
        }
        return ans;
    }
}
