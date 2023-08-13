package com.practice.DataStructure.BinarySearch;

public class NumberofOccurrence {
    public static void main(String[] args) {
        System.out.println(countTarget(new int[]{1,1,1,2,2,3,3},3));
    }

    private static int countTarget(int[] array, int target) {
        int first = firstOccurance(array,target);
        if(first == array.length || array[first] != target){
            return -1;
        }
        int last = lastOccurance(array,target)-1;
        return last - first + 1;
    }

    private static int firstOccurance(int[] array, int target) {
        //lower bound
        int low = 0;
        int high = array.length - 1;
        int ans = array.length;

        while(low <= high){
            int mid = low + ((high - low)/2);
            if(array[mid] >= target){
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    private static int lastOccurance(int[] array, int target) {
        //upper bound
        int low = 0;
        int high = array.length - 1;
        int ans = array.length;

        while(low <= high){
            int mid = low + ((high - low)/2);
            if(array[mid] > target){
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
}
