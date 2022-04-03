// ** Dutch National Flag Algorithm
// Problem Link :- https://leetcode.com/problems/sort-colors/

package Array;

import java.util.Arrays;
// import java.util.HashMap;
// import java.util.Map;

public class SortColors_DutchNationalFlag {

    public static int[] sortColors(int[] arr){
        int low = 0, mid = 0, high = arr.length-1;
        while(mid <= high){
            switch(arr[mid]){
                case 0 : 
                    swap(arr, low, mid);
                    low++;
                    mid++;
                    break;
                case 1 :
                    mid++;
                    break;
                case 2 :
                    swap(arr, mid, high);
                    high--;
                    break;
                default :
                    throw new Error("Invalid Element");
            }
        }
        return arr;
    } 

    // Swap the elements
    public static void swap(int []arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Couting Sort - TC - O(N^2) SC - O(N)
    // public static int[] countSort(int[] arr){
    //     HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
    //     for(int i=0; i<arr.length; i++){
    //         if(hm.containsKey(arr[i])){
    //             hm.put(arr[i], ( hm.get(arr[i]) + 1) );
    //         }else{
    //             hm.put(arr[i], 1);
    //         }
    //     }
    //     int i=0;
    //     for (Map.Entry<Integer, Integer> mapEntry : hm.entrySet()) {
    //         for(int j = 0; j < mapEntry.getValue(); j++){
    //             arr[i] = mapEntry.getKey();
    //             i++;
    //         }
    //     }
    //     return arr;
    // }


    public static void main(String[] args) {
        int[] arr = {2,0,2,1,1,0};
        // System.out.println(Arrays.toString(countSort(arr)));
        System.out.println(Arrays.toString(sortColors(arr)));
    }
}
