// Problem Link :- https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

package Array.ArrayPart_1;

public class StockBuySell {

    // TC : O(N), SC : (1)
    public static int maxProfit(int[] arr){
        int maxProfit = 0;
        int minimum = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i] < minimum) minimum = arr[i];
            maxProfit = Math.max(maxProfit, arr[i] - minimum);
        }
        return maxProfit;
    }
    
    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        // int[] arr = {7,6,4,3,1};
        System.out.println(maxProfit(arr));
    }

}
