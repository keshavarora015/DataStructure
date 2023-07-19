package org.example.DataStructure.Array;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] height = {2,3,4,5,18,17,6};
        int ans = containerWithMostWater(height);
        System.out.println(ans);
    }

    private static int containerWithMostWater(int[] height) {
        int maxArea = 0;
        int i = 0;
        int j = height.length-1;
        while (j>i){
            int area = Math.min(height[i],height[j]) * (j-i);
            maxArea = Math.max(area,maxArea);
            if(height[i]<height[j])
                i++;
            else
                j--;
        }
        return maxArea;
    }

}
