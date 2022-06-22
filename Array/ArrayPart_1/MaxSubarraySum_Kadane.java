// Kadane's Algo
// Problem Link :- https://leetcode.com/problems/maximum-subarray/

package Array.ArrayPart_1;

public class MaxSubarraySum_Kadane {

    // TC - O(N), SC - 0(1)
    public static int maxSubarraySum(int[] arr){
        int maxSum = arr[0];
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
            if(sum > maxSum) maxSum = sum;
            if(sum < 0) sum = 0;
        }
        return maxSum;
    }
    
    // TC - O(N^2), SC - 0(1)
    // public static int maxSubarraySum(int[] arr){
    //     int maxSum = arr[0];
    //     for(int i=0; i<arr.length; i++){
    //         int sum = 0;
    //         for(int j=i; j<arr.length; j++){
    //             sum += arr[j];
    //             maxSum = Math.max(sum, maxSum);
    //         }
    //     }
    //     return maxSum;
    // }

    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        // int[] arr = {5,4,-1,7,8};
        // int[] arr = {-2,-1};
        System.out.println(maxSubarraySum(arr));
    }
    
}
