package com.practice.DataStructure.BinarySearch;

import java.util.Arrays;

public class FloorAndCeil {
    public static void main(String[] args) {
        System.out.println("Floor : "+ getFloor(new int[]{3,4,4,7,8,10},5));
        System.out.println("Ceil : "+ getCeil(new int[]{3,4,4,7,8,10},5));
    }
    private static int getFloor(int arr[],int target){
        //arr[i] <= target
        int low = 0;
        int high = arr.length -1;
        int ans = arr.length;
        while(low <= high){
            int mid = low + ((high - low)/2);
            if(arr[mid] <= target){
                ans = arr[mid];
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }
    private static int getCeil(int arr[],int target){
        //arr[i] >= target
        //loweBound of array
        int low = 0;
        int high = arr.length -1;
        int ans = arr.length;
        while(low <= high){
            int mid = low + ((high - low)/2);
            if(arr[mid] >= target){
                ans = arr[mid];
                high = mid -1;
            } else {
                low = mid +1;
            }
        }
        return ans;
    }
}
