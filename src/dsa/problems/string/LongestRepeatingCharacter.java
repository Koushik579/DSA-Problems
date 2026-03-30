package dsa.problems.string;

public class LongestRepeatingCharacter {
    public int longestRepeat(String str, int chance){
        int[] frequency = new int[26];
        int start = 0;
        int maxLen = 0;
        int maxFreq = 0;
        for (int i = 0; i < str.length(); i ++){
            frequency[str.charAt(i) - 'A']++;
            maxFreq = Math.max(maxFreq, frequency[str.charAt(i) - 'A']);
            if((i - start + 1) - maxFreq > chance){
                frequency[str.charAt(i) - 'A']--;
                start ++;
            }
            maxLen = Math.max(maxLen,i-start+1);
        }
        return maxLen;
    }
}
