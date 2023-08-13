package com.practice.DataStructure.Array;

public class BestTimeToBuyAndSellStock {

    public static void main(String[] args) {
        int[] stock = {2,1,4};
        int ans = bestTimeToBuyAndSell(stock);
        System.out.println(ans);
    }

    private static int bestTimeToBuyAndSell(int[] stock) {
        int maxProfit = 0;
        int buyPrice = stock[0];
        for (int i =0 ; i<stock.length ; i++){
            if(stock[i]<buyPrice){
                buyPrice = stock[i];
            }
            maxProfit = Math.max(maxProfit,stock[i]- buyPrice);
        }
        return maxProfit;
    }
}
