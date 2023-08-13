package com.practice.DataStructure.BinarySearch;

public class SquareRootofanumber {
    public static void main(String[] args) {
        System.out.println(sqrtN(50));
    }
    public static int sqrtN(long N) {
        long low = 1;
        long high = N;
        long ans = N;

        while(low <= high){
            long mid = low + ((high - low)/2);
            long val = mid * mid;
            if(val <= N){
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
    return (int) ans;
    }
}
