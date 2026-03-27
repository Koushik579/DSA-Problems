package dsa.problems.hashMap;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacter {
    public int findCharacter(String str){
        if(str.trim().isEmpty()) return -1;
        Map<Character,Integer> frequency = new HashMap<>();
        String word = str.toUpperCase();
        for (char c : word.toCharArray()){
          frequency.put(c, frequency.getOrDefault(c,0)+1);
        }
        for(int i =0; i < word.length(); i++){
            if(frequency.get(word.charAt(i)) == 1 ){
                return i;
            }
        }
        return -1;
    }
}
