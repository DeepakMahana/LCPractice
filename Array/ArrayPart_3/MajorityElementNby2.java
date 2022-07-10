// Problem Link :- https://leetcode.com/problems/majority-element/

// Moore's Voting Algorithm

package Array.ArrayPart_3;

public class MajorityElementNby2 {

    public static int getMajorityElement(int[] nums){
        int count = 0;
        int candidate = 0;
        for(int num : nums){
            if(count == 0){
                candidate = num;
            }
            if(num==candidate) count++;
            else count--;
        }
        return candidate;
    }

    public static void main(String[] args) {
        int[] arr = {2,2,1,1,1,2,2};
        System.out.println(getMajorityElement(arr));    
    }
    
}