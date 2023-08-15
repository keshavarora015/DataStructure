package com.practice.DataStructure.BinarySearch;
import java.util.Arrays;

//Question :: https://leetcode.com/problems/koko-eating-bananas/

public class KokoEatingBananas {
    public static void main(String[] args) {
        System.out.println(minEatingSpeed(new int[]{30,11,23,4,20},5));
    }
    public static int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = Arrays.stream(piles).max().getAsInt();
        int ans = high;
        while (low <= high){
            int mid = (low + high) / 2;
            if(getEatingSpeedHours(mid,piles) <= h ){
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    private static int getEatingSpeedHours(int mid, int[] piles) {
        int time = 0;
        for(int i = 0 ; i<piles.length ; i++){
            time += Math.ceil((double)piles[i]/(double)mid);
        }
        return time;
    }
}
