// Problem Link :- https://leetcode.com/problems/merge-sorted-array/

package Array.ArrayPart_2;

import java.util.Arrays;

public class MergeTwoSortedArrays {
    
    //// General Solution
    public static void mergeSortedArraysDifferently(int[] X, int[] Y){

        int m = X.length;
        int n = Y.length;

        // Consider each element `X[i]` of array `X` and ignore the element if it is already in the correct order; 
        // otherwise, swap it with the next smaller element, which happens to be the first element of `Y`.
        for (int i = 0; i < m; i++)
        {
            // compare the current element of `X[]` with the first element of `Y[]`
            if (X[i] > Y[0])
            {
                // swap `X[i] with `Y[0]`
                int temp = X[i];
                X[i] = Y[0];
                Y[0] = temp;
 
                int first = Y[0];
 
                // move `Y[0]` to its correct position to maintain the sorted
                // order of `Y[]`. Note: `Y[1…n-1]` is already sorted
                int k;
                for (k = 1; k < n && Y[k] < first; k++) {
                    Y[k - 1] = Y[k];
                }
 
                Y[k - 1] = first;
            }
        }

    }

    // LC Solution
    public static void mergeSortedArrays(int[] X, int[] Y, int m, int n){
        int pt1 = m-1, pt2 = n-1, i = m+n-1;
        while(pt2 >= 0){
            if(pt1 >=0 && X[pt1] > Y[pt2]){
                X[i--] = X[pt1--];
            }else{
                X[i--] = Y[pt2--];
            }
        }
    }


    public static void main(String[] args) {
        
        //// If required both the arrays to be in sorted order
        // int[] X = { 1,2,7 };
        // int[] Y = { 2,5,6 };
        // mergeSortedArraysDifferently(X, Y);
        // System.out.println("X: " + Arrays.toString(X));
        // System.out.println("Y: " + Arrays.toString(Y));

        // LC Q Solution
        int[] X = { 4,5,6,0,0,0 };
        int[] Y = { 1,2,3 };
        int m = 3;
        int n = 3;
        mergeSortedArrays(X, Y, m, n);
        System.out.println("ResultantArray: " + Arrays.toString(X));    
    }

}
