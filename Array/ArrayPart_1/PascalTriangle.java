// Problem Link :- https://leetcode.com/problems/pascals-triangle/

package Array.ArrayPart_1;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {

    // TC :- O(N^2) , SC :- O(N^2)
    public static List<List<Integer>> pascalTriangle(int rows){
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> row, previous = null;
        for(int i=0; i<rows; i++){
            row = new ArrayList<Integer>();
            for(int j=0; j<=i; j++){
                if(j==0||j==i){
                    row.add(1);
                }else{
                    row.add(previous.get(j-1)+previous.get(j));
                }
            }
            previous = row;
            result.add(row);
        }
        return result;
    }

    // If row = 5 and col = 3
    // (row-1)C(col-1) = 4C2 = 4x3/2x1 = 6
    public static int pascalRowCol(int row, int col) {
        int res = 1;
        row--;
        col--;
        for(int i=0; i<col; ++i){
            res *= (row - i);
            res /= (i + 1);
        }
        return res;
    }

    public static void main(String[] args) {
        int rows = 5;
        System.out.println(pascalTriangle(rows));
        int row = 5, col = 3;
        System.out.println(pascalRowCol(row, col));
    }
    
}
