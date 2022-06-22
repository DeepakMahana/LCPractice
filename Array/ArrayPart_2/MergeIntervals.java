// Problem Link :- https://leetcode.com/problems/merge-intervals/

package Array.ArrayPart_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {

    public static int[][] mergeIntervals(int[][] intervals){
        List<int[]> result = new ArrayList<>();
        if(intervals.length==0 || intervals == null){
            return result.toArray(new int[0][]);
        }

        // Sort the intervals
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        int start = intervals[0][0];
        int end = intervals[0][1];

        // Check the intervals if falling under range
        for(int[] i : intervals){
            if(i[0] <= end){
                end = Math.max(end, i[1]);
            }else{
                result.add(new int[]{start, end});
                start = i[0];
                end = i[1];
            }
        }
        result.add(new int[]{start, end});
        return result.toArray(new int[0][]);
    }

    public static void main(String[] args) {
        int[][] intervals = { {1,3},{2,6},{8,10},{15,18} };
        System.out.println(Arrays.deepToString(mergeIntervals(intervals)));
    }
    
}
