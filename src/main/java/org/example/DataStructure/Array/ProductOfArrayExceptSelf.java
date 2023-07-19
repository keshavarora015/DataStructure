package org.example.DataStructure.Array;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int[] array = {3,4,6,1,2};
        int []ans = productOfArrayExceptSelf(array);
        for (int value : ans){
            System.out.print(value+" ");
        }

    }

    /**
     *
     *               1   2   3   4
     *               --------------
     *  left        (1)  1   2   6
     *  right       24   12  4  (1)
     *  ans         24   12  8  6
     * */

    private static int[] productOfArrayExceptSelf(int[] array) {
        int [] ans = new int[array.length];
        int [] left = new int[array.length];
        int [] right = new int[array.length];

        left[0] = 1;
        right[array.length-1] = 1;
        for(int i=1;i< array.length;i++){
            left[i] = left[i-1] * array[i-1];
        }
        for(int j = array.length -2 ; j>= 0 ;j--){
            right[j] = right[j+1] * array[j+1];
        }
        for(int i=0;i< array.length;i++){
            ans [i] = left[i] * right[i];
        }

        return ans;
    }
}
