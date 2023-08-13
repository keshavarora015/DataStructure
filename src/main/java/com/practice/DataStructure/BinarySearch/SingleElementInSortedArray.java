package com.practice.DataStructure.BinarySearch;

public class SingleElementInSortedArray {
    public static void main(String[] args) {
        System.out.println(singleNonDuplicate(new int[]{1,1,2,2,3,3,4,8,8}));
    }

    public static int singleNonDuplicate(int[] nums) {
        if(nums.length == 1)
            return nums[0];
        if(nums[0] != nums[1])
            return nums[0];
        if(nums[nums.length - 1] != nums[nums.length - 2])
            return nums[nums.length - 1];

        int low = 1;
        int high = nums.length - 2;
        while (low <= high){
            int mid = low + ((high - low)/2);
            if(nums[mid] != nums[mid + 1] && nums[mid] != nums[mid - 1]){
                return nums[mid];
            }
            if(mid % 2 == 0 && nums[mid] == nums[mid+1]
                    || mid % 2 == 1 && nums[mid - 1] == nums[mid]){
                //ans exist in right half
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    /**
     *  Eg      : 1 1 2 2 3 3 4 5 5 6 6
     *  index   : 0 1 2 3 4 5 6 7 8 9 10
     *  ---------------------------------
     *  (even,odd) index -> every element pair present
     *                      before single element like (1,1), (2,2) (3,3)
     *                      i.e. element is present on right half
     *
     *  (odd,even) index -> every element pair present
     *                      after single element like (5,5), (6,6)
     *                      i.e. element is present on left half
     *
     *  condition for single element -> arr[i-1] != arr[i] != arr[i+1]
     *                                  i.e. arr[i] is single element -> 4
     *
     * */
}
