package dsa.problems.arrays;

import java.util.Arrays;
import java.util.Comparator;

public class TwoSum {
    public int[] twoSum(int[] ar,int target){
        int[][] findNum = new int[ar.length][2];
        int start = 0;
        int end = ar.length-1;
        for(int i=0; i<ar.length; i++){
            findNum[i][0] = ar[i];
            findNum[i][1] = i;
        }
        Arrays.sort(findNum, Comparator.comparingInt(a ->a[0]));
        while(start > end){
            if(findNum[start][0] + findNum[end][0] == target){
                return new int[] {findNum[start][1],findNum[end][1]};
            }
            if(findNum[start][0] + findNum[end][0] > target){
                end--;
            }
            else{
                start++;
            }
        }
        throw new IllegalArgumentException("Two Sum Not Possible");
    }
}
