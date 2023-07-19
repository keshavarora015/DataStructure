package org.example.DataStructure.Array;

import org.example.Print;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
    public static void main(String[] args) {
        int [][] intervals = {{1,3},{2,6},{8,10},{15,18}};
        int [][] ans = merge(intervals);
        Print print = new Print();
        print.print2array(ans);
    }
    public static int[][] merge(int[][] intervals) {
        if(intervals.length <=1){
            return intervals;
        }
        Arrays.sort(intervals,(a,b)-> a[0]-b[0]);
        List<int[]> ans = new ArrayList<>();

        /**
         * {{1,3},{2,6},{8,10},{15,18}};
         * */
        int[] interval = intervals[0];
        ans.add(interval); //ans = {1,3}

        for(int[] newInterval : intervals ){
            if(newInterval[0] <= interval[1]){
                interval[1] = Math.max(interval[1],newInterval[1]);
            }
            else {
                interval = newInterval;
                ans.add(interval);
            }
        }
        return ans.toArray(new int[ans.size()][]);
    }
}
