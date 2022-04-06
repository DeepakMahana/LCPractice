// Problem Link : https://leetcode.com/problems/find-the-duplicate-number

package Array;

import java.util.Arrays;

public class FindDuplicate {

    //// TC : O(N), SC : O(N)
    // public static int findDuplicate(int[] arr){
    //     int[] countArr = new int[arr.length+1];
    //     Arrays.fill(countArr, 0);
    //     if(arr.length <= 1) return arr[0];
    //     for(int i=0; i<arr.length; i++){
    //         if(countArr[arr[i]] != 0){
    //             return arr[i];
    //         }else{
    //             countArr[arr[i]] = countArr[arr[i]] + 1;
    //         }
    //     }
    //     return arr[0];
    // }
    
    //// TC : O(N), SC : O(1)
    public static int findDuplicate(int[] arr){
        int slow = arr[0];
        int fast = arr[0];
        do{
            slow = arr[slow];
            fast = arr[arr[fast]];
        }while(slow != fast);

        fast = arr[0];

        while(slow != fast){
            slow = arr[slow];
            fast = arr[fast];
        }
        return slow;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{3,1,3,4,2};
        System.out.println(findDuplicate(arr));
    }
    
}
