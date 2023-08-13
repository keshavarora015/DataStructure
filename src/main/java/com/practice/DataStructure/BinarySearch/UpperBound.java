package com.practice.DataStructure.BinarySearch;

public class UpperBound {
    public static void main(String[] args) {
        System.out.println(upperBound(new int[]{1,4,7,8,10},7));
        // ans = 7 and index 4
    }
    public static int upperBound(int []arr, int target) {
        // Write your code here
        //arr[ind] > target
        int low = 0;
        int high = arr.length - 1;
        int ans = arr.length;
        while(low <= high){
            int mid = low + ((high - low)/2);
            if(arr[mid] > target){
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
}
