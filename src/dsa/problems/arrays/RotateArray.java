package dsa.problems.arrays;

public class RotateArray {
    public int[] partialRotation(int[] nums,int start, int end){
        while (start < end){
            int atStart = nums[start];
            int atEnd = nums[end];

            nums[start] = atEnd;
            nums[end] = atStart;

            start ++;
            end --;
        }
        return nums;
    }
    public int[] rotatedArray(int[] nums,int k){
        if (nums == null || k == 0) return nums;
        if (k < 0) return new int[] {-1};
        k = k % nums.length;

        nums = partialRotation(nums,0,nums.length - 1);
        nums = partialRotation(nums,0,k-1);
        nums = partialRotation(nums,k,nums.length - 1);
        return nums;
    }
}
