// PS : https://leetcode.com/problems/unique-paths

package Array.ArrayPart_3;

public class UniquePath {

    // Recursive Solution
    public static int findUniquePathsRecursive(int row, int col, int rowSize, int colSize){
        // base cond
        if (row == (rowSize-1) && col == (colSize-1)) return 1;
        // if out of matrix return zero
        if (row >= rowSize || col >= colSize) {
            return 0;
        }else {
            return findUniquePathsRecursive(row + 1, col, rowSize, colSize) + findUniquePathsRecursive(row, col + 1, rowSize, colSize);
        }
    }

    // DP Solution
    public static int findUniquePathsDp(int row, int col, int rowSize, int colSize, int[][] dp){
        // base cond
        if (row == (rowSize-1) && col == (colSize-1)) return 1;
        // if out of matrix return zero
        if (row >= rowSize || col >= colSize) return 0;
        // dp
        if(dp[row][col] != 0) {
            return dp[row][col];
        } else{
            return dp[row][col] = findUniquePathsDp(row+1, col, rowSize, colSize, dp) + findUniquePathsDp(row, col+1, rowSize, colSize, dp);
        }
    }

    // Combinatorics
    public static int findUniquePathsCombinatorics(int rowSize, int colSize){
        int N = rowSize + colSize - 2;
        int r = colSize - 1;
        double res = 1;
        for (int i = 1; i <= r; i++){
            res = res * (N - r + i) / i;
        }
        return (int)res;
    }


    public static void main(String[] args) {
        int rowSize = 3, colSize = 7;
        // Recursive
        //System.out.println(findUniquePathsRecursive(0, 0, rowSize, colSize));
        // DP
        int[][] dpMatrix = new int[rowSize][colSize];
        System.out.println(findUniquePathsDp(0, 0, rowSize, colSize, dpMatrix));
        // Combinatorics
        System.out.println(findUniquePathsCombinatorics(rowSize, colSize));
    }
    
}
