package com.practice.DataStructure.BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        System.out.println(search(new int[]{-1,0,3,5,9,12},9));
    }
    public static int search(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        while(low <= high){
            int mid = low + ((high-low)/2);
            if(arr[mid] == target)
                return mid;
            else if(arr[mid] < target)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }
}
