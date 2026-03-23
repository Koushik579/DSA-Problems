package dsa.problems.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Duplicate {
    //With for loop
    public boolean isDuplicateBySorting(int[] ar){
        Arrays.sort(ar);
        for(int i = 0; i < ar.length; i++){
            if(i == ar.length -1){
                return false;
            }
            if(ar[i] == ar[i+1]){
                return true;
            }
        }
        return false;
    }
    //with Two Pointer
    public boolean isDuplicateWithList(int[] ar){
        List<Integer> nums = new ArrayList<>();
        for(int i = 0; i < ar.length; i++){
            if(nums.contains(ar[i])){
                return true;
            }
            nums.add(ar[i]);
        }
        return false;
    }
}
