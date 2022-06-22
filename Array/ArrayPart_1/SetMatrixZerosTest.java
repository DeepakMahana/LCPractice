package Array.ArrayPart_1;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class SetMatrixZerosTest {
    
    @Test
    public void PassTest() throws Exception{
        int[][] matrix = { {1,1,1},{1,0,1},{1,1,1} };
        int[][] result = Array.ArrayPart_1.SetMatrixZeros.setZeroes(matrix);
        int[][] res = {{1,0,1}, {0,0,0}, {1,0,1}};
        assertArrayEquals(res, result);
    }

    @Test
    public void FailTest() throws Exception{
        int[][] matrix = { {1,1,1},{1,0,1},{1,1,1} };
        int[][] result = Array.ArrayPart_1.SetMatrixZeros.setZeroes(matrix);
        int[][] res = {{1,0,1}, {0,0,1}, {1,0,1}};
        assertArrayEquals(res, result);
    }
}
