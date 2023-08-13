package com.practice.DataStructure.BinarySearch;

public class FindNthRootOfM {
    public static void main(String[] args) {
        System.out.println(NthRoot(9, 1953125));
    }
    public static int NthRoot(int n, int m) {
        // Write your code here.
        int low = 1;
        int high = m;
        while(low <= high){
            int mid = (low + high)/ 2;
            if(getRoot(mid,n,m) == 1){
                return mid;
            } else if (getRoot(mid,n,m) == 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    private static int getRoot(int mid, int n, int m) {
        long ans = 1;
        int count = n;
        while(count!= 0){
            ans = ans * mid;
            count--;
            if(ans > m)
                return 2;
        }
        if(ans == m)
            return 1;
        return 0;
    }
}
