// Problem Link :- https://leetcode.com/problems/set-matrix-zeroes/

package Array.ArrayPart_1;

import java.util.*;

public class SetMatrixZeros {
    
    // TC :- O( 2 * (N X M) ) , SC :- O(1)
    public static int[][] setZeroes(int[][]matrix){

        boolean markColZero = false;
        int rows = matrix.length, cols = matrix[0].length;

        for(int i=0; i<rows; i++){
            if(matrix[i][0] == 0) markColZero = true;
            for(int j=1; j<cols; j++){
                if(matrix[i][j] == 0){
                    matrix[i][0] = matrix[0][j] = 0;
                }
            }
        }

        for(int i=rows-1; i>=0; i--){
            for(int j=cols-1; j>=1; j--){
                if(matrix[i][0] == 0 || matrix[0][j] == 0){
                    matrix[i][j] = 0;
                }
            }
            if(markColZero) matrix[i][0] = 0; 
        }

        return matrix;
    }

    public static void main(String[] args) {
        int[][] matrix = { {1,1,1},{1,0,1},{1,1,1} };
        System.out.println(Arrays.deepToString(setZeroes(matrix)));
    }
    
}
