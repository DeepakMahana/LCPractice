package Array.ArrayPart_3;

public class SearchSortedMatrix {

    // think of a imaginary index starting from 0 to last element
    // find the (row, col) position of the imaginary index using (index/col, index%col)
    public static boolean searchSortedMatrix(int[][] matrix, int target){

        if(matrix.length == 0) return false;

        int row = matrix.length;
        int col = matrix[0].length;
        int low = 0;
        int high = (row * col) - 1;

        while(low <= high){
            // find mid
            int mid = (low + (high - low) / 2);
            // if target found
            if(matrix[mid/col][mid%col] == target){
                return true;
            }
            // if target less then shift search to left
            if(matrix[mid/col][mid%col] < target){
                low = mid + 1;
            }else{
                high = mid - 1;
            }

        }
        return false;
    }
    

    public static void main(String[] args) {
        int[][] matrix = { {1,3,5,7},{10,11,16,20},{23,30,34,60} };
        System.out.println(searchSortedMatrix(matrix, 3333));
    }

}


