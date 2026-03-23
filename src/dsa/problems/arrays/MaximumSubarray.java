package dsa.problems.arrays;

public class MaximumSubarray {
    public int maxSubarray(int[] ar){
        int tempSum = 0;
        int sum = Integer.MIN_VALUE;
        for(int num : ar){
            tempSum += num;
            if(tempSum > sum){
                sum = tempSum;
            }
            if (tempSum < 0){
                tempSum = 0;
            }
        }
        return sum;
    }
}
