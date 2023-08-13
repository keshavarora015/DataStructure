package com.practice.DataStructure.BinarySearch;

public class FindPeakElement {
    public static void main(String[] args) {
        System.out.println(findPeakElement(new int[]{1,2,1,2,1}));
    }
    public static int findPeakElement(int[] nums) {

        if(nums.length == 1)
            return 0;

        if(nums[0] > nums[1])
            return 0;

        if(nums[nums.length -1] > nums[nums.length -2] )
            return nums.length -1 ;

        int low = 1;
        int high = nums.length - 2;
        while(low <= high){
            int mid = low + ((high - low) / 2);
            if(nums[mid] > nums[mid - 1] && nums[mid] > nums[mid+1]) {
                return mid;
            }
            else if(nums[mid] > nums[mid - 1]){
                //mid on left side
                low = mid + 1;
            } else {
                high = mid - 1;
            }

        }

       return -1;
    }

    /**
     *              (peak element)
     *  |                /\
     *  |               /  \
     *  |  (-infinity) /    \  (-infinity)
     *  |___________________________
     *
     *  if my mid lies on increasing side then peak is present at right side
     *  if my mid lies on decreasing side then peak is present at left side
     *
     *
     *
     *          int n = arr.length;
     *         //checking done for initial cases where finding and is very easy
     *         if(n==1)            //edgecase1
     *             return 0;
     *
     *         if(arr[0] > arr[1])   //edgecase 2
     *             return 0;
     *
     *         if(arr[n-1] > arr[n-2])  //edgecase 3
     *             return n-1;
     *
     *         // now apply bS on remaining part
     *
     *         int low = 1;
     *         int high = n-2;
     *
     *         while(low <= high)
     *         {
     *             int mid = low +(high - low)/2;
     *
     *             if(arr[mid]>arr[mid+1] && arr[mid]>arr[mid-1])
     *             {
     *                 return mid ;
     *             }
     *
     *             else if  (arr[mid]>arr[mid-1])        //mid on the increasing path that means our ans will be in right side
     *                 low = mid+1;
     *             else                                // mid is on the decreasing path  peak will be on left side
     *                 high = mid -1;
     *
     *         }
     *         return -1;
     *
     * */
}
