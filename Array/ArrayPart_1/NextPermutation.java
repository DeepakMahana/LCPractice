// Problem Link :- https://leetcode.com/problems/next-permutation/

package Array.ArrayPart_1;

import java.util.Arrays;

public class NextPermutation {

    public static int[] nextPermutation(int arr[]){

        if(arr == null || arr.length <= 1) return arr;

        // Traverse from back and find the breakpoint
        int i = arr.length - 2;
        while( i >= 0 && arr[i] >= arr[i+1] ) i--; 

        // Find the first bigger element than the breakpoint value
        if(i>=0){
            int j = arr.length - 1;
            while(arr[j] <= arr[i]) j--;
            // Swap the breakpoint value with the element greater than it
            swap(arr, i, j);
        }
        
        // If no breakpoint found just reverse the array
        reverse(arr, i+1, arr.length-1);
        
        return arr;
    }

    // Reverse array
    public static void reverse(int[] arr, int i, int j){
        while (i<j) swap(arr, i++, j--);
    }

    // Swap the elements
    public static void swap(int []arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        // int[] arr = {1,3,5,4,2};
        // int[] arr = {1,1,5};
        int[] arr = {3,2,1};
        System.out.println(Arrays.toString(nextPermutation(arr)));
    }
    
}
