package com.practice.DataStructure.BinarySearch;


import java.util.Arrays;

//Question :: https://leetcode.com/problems/minimum-number-of-days-to-make-m-bouquets/
public class MinimumNumberOfDaysToMakeBouquets {
    public static void main(String[] args) {
        System.out.println(minDays(new int[]{1,2,1,2,7,2,2,3,1},2, 3));
    }
    public static int minDays(int[] bloomDay, int m, int k) {
        long n = (long)m*k;
        if(bloomDay.length < n)
            return -1;

        int low = Arrays.stream(bloomDay).min().getAsInt();
        int high = Arrays.stream(bloomDay).max().getAsInt();

        int ans = high;

        while(low <= high){
          int mid = (low+high)/2;
          if(getMinDaysForBouquets(bloomDay,mid,m,k)){
              ans = mid ;
              high = mid - 1;
          } else {
              low = mid + 1;
          }
        }
        return ans;
    }

    private static boolean getMinDaysForBouquets(int[] bloomDay, int mid, int m, int k) {
        int count = 0;
        int ans = 0;
        for(int i =0 ;i< bloomDay.length ; i++){
            if(bloomDay[i] <= mid){
                count++;
            } else {
                ans += (count/k);
                count = 0;
            }
        }
        ans += (count/k);
        if(ans < m)
            return false;
        return true;
    }
}
