// Problem Link :- https://leetcode.com/problems/rotate-image/

package Array.ArrayPart_2;

import java.util.Arrays;

public class RotateMatrix {

    // TC : O(N^2) SC : O(1)
    public static int[][] rotateMatrix(int[][] matrix){
        int row = matrix.length, col = matrix[0].length;
        // Transpose
        for(int i=0; i<row; i++){
            for(int j=i; j<col; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        // Reverse Each Row
        for(int i=0; i<row; i++){
            for(int j=0; j<col/2; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][row-1-j];
                matrix[i][row-1-j] = temp;
            }
        }
        return matrix;
    }
    
    public static void main(String[] args) {
        int[][] matrix = { {1,2,3},{4,5,6},{7,8,9} };
        System.out.println(Arrays.deepToString(rotateMatrix(matrix)));
    }

}
