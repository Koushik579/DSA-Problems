package dsa.problems.hashMap;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public int[] twoSum(int[] ar , int target){
        Map<Integer,Integer> digits = new HashMap<>();
        int[] result = new int[2];
        for(int i = 0; i < ar.length; i ++){
            int reqTarget = target - ar[i];
            if(digits.containsKey(reqTarget)){
                int index = digits.get(reqTarget);
                return new int[]{i, index};
            }
            digits.put(ar[i],i);
        }
        throw new IllegalArgumentException("No Solution found");
    }

}
