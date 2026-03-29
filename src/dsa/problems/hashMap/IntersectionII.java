package dsa.problems.hashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IntersectionII {
    public List<Integer> findIntersection(int[] ar1, int[] ar2){
        List<Integer> result = new ArrayList<>();
        Map<Integer,Integer> freq = new HashMap<>();
        for (int k : ar1) {
            freq.put(k, freq.getOrDefault(k, 0) + 1);
        }
        for (int j : ar2) {
            if (freq.containsKey(j) && freq.get(j) > 0) {
                result.add(j);
            }
        }

        return result;
    }
}
