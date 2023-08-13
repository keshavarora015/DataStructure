package com.practice.DataStructure.BinarySearch;

public class LowerBound {
    public static void main(String[] args) {
        System.out.println(lowerBound(new int[]{1,2,2,3},0));
        // ans = 7 and index 4
    }
    public static int lowerBound(int []arr, int target) {
        // Write your code here
        //arr[ind] >= target
        int low = 0;
        int high = arr.length - 1;
        int ans = arr.length;
        while(low <= high){
            int mid = low + ((high - low)/2);
            if(arr[mid] >= target){
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
}
