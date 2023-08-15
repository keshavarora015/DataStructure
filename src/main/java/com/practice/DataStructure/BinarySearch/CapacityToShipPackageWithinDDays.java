package com.practice.DataStructure.BinarySearch;

//Question :: https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/

import java.util.Arrays;

public class CapacityToShipPackageWithinDDays {
    public static void main(String[] args) {
        System.out.println(shipWithinDays(new int[]{1,2,3,1,1},4));
    }
    public static int shipWithinDays(int[] weights, int days) {
        int low = Arrays.stream(weights).max().getAsInt();
        int high = Arrays.stream(weights).sum();
        int ans = high;
        while(low <= high){
            int mid = (low + high)/ 2;
            if(getDaysForShipment(weights,mid) <= days ){
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    private static int getDaysForShipment(int[] weights, int capacity) {
        int days = 1;
        int sum = 0;
        for(int i = 0 ; i < weights.length;i++){
            if(sum + weights[i] > capacity){
               days++;
               sum = weights[i];
            } else{
                sum += weights[i];
            }
        }
        return days;
    }
}
