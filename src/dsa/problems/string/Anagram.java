package dsa.problems.string;

import java.util.HashMap;
import java.util.Map;

public class Anagram {
    public boolean checkAnagram(String word,String check){
        if(word.length() != check.length())return false;
        Map<Character,Integer> frequency = new HashMap<>();
        for(int i = 0;i < word.length(); i++){
            frequency.put(word.charAt(i),frequency.getOrDefault(word.charAt(i),0)+1);
            frequency.put(check.charAt(i),frequency.getOrDefault(check.charAt(i),0)-1);
        }
        for(int count : frequency.values()){
            if(count != 0) return false;
        }
        return true;
    }
}
