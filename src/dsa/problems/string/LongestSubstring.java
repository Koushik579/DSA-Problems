package dsa.problems.string;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {

    public int findLengthOfLongestSubstring(String str){

        Set<Character> longestSubstring = new HashSet<>();
        int start =0;
        int len = 0;
        for(int i = 0; i < str.length(); i++){
           while(longestSubstring.contains(str.charAt(i))){
               longestSubstring.remove(str.charAt(start));
               start ++;
           }
           longestSubstring.add(str.charAt(i));
           len = Math.max(len,i - start + 1);
        }
        return len;
    }

    public int optimisedLongestSubstring(String str){
        int[] map = new int[126];
        int start = 0;
        int maxLen = 0;
        for(int i = 0; i < str.length(); i++ ){
            start = Math.max(start,map[str.charAt(i)]);
            maxLen = Math.max(maxLen,i-start+1);
            map[str.charAt(i)] = i+1;
        }
        return maxLen;
    }

}
