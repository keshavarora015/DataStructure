package org.example.DataStructure.Array;

import org.example.Print;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public static void main(String[] args) {
        int[] candidates = {2,3,6,7};
        int target = 7 ;
        List<List<Integer>> list =  combinationSum(candidates,target);
        Print print = new Print();
        print.print2DList(list);
    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        combSum(0,candidates,target,ans,new ArrayList<>());
        return ans;
    }

    private static void combSum(int index, int[] candidates, int target, List<List<Integer>> ans, List<Integer> store) {
        if(index == candidates.length){
            if(target == 0){
                ans.add(new ArrayList<>(store));
            }
            return;
        }

        if(candidates[index]<=target){
            store.add(candidates[index]);
            combSum(index,candidates,target-candidates[index],ans,store);
            store.remove(store.size()-1);
        }
        combSum(index+1,candidates,target,ans,store);
    }
}
