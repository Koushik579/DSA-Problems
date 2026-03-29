package dsa.problems.arrays;

import java.util.Arrays;
import java.util.Comparator;

public class TwoSum {
    public int[] twoSum(int[] ar,int target){

        int start = 0;
        int end = ar.length-1;
        for( int i = 0; i < ar.length; i ++ ){
            if(ar[start] + ar[end] > target){
                end --;
            }
            else if(ar[start] + ar[end] == target){
                return new int[] {start,end};
            }
            else start++;
        }
        return new int[]{-1};
    }
}
