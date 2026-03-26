package dsa.problems.hashMap;

import java.util.HashMap;
import java.util.Map;

public class ContainDuplicateII {
    public boolean checkDuplicate(int[] ar,int range){

        Map<Integer, Integer> catchIndex = new HashMap<>();
        for(int i = 0; i < ar.length; i++){
            if(catchIndex.containsKey(ar[i])){
                if(Math.abs((catchIndex.get(ar[i])-i)) <= range){
                    return true;
                }
            }
            catchIndex.put(ar[i],i);
        }

        return false;
    }
}
