// Problem Link :- https://www.codingninjas.com/codestudio/problems/873366

package Array.ArrayPart_2;
import java.util.Arrays;

public class FindMissingDuplicate {
    
    public static void duplicateMissingNumber(int[] arr){
        int duplicate = 0, missing = 0;
        int[] countArr = new int[arr.length+1];
        Arrays.fill(countArr, 0);
        if(arr.length <= 1) throw new Error("Array Length is insufficient");
        for(int i=0; i<arr.length; i++){
            countArr[arr[i]] = countArr[arr[i]] + 1;
        }
        for(int i=1; i<countArr.length; i++){
            if(countArr[i] == 0) missing = i;
            if(countArr[i] > 1) duplicate = i;
        }
        System.out.println("Repeating : " + duplicate + "  " +  "Missing : " + missing);
    }

    public static void main(String[] args) {
        int[] arr = new int[]{6,4,3,5,5,1};
        duplicateMissingNumber(arr);
    }
}
