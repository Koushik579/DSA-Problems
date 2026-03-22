package dsa.problems.string;

public class Palindrome {

    public boolean checkPalindrome(String word){
        String fixWord = word.toUpperCase();
        int start = 0;
        int end = fixWord.length()-1;
        for(int i=0; i<word.length(); i++){
            if(fixWord.charAt(start) != fixWord.charAt(end)){
                return false;
            }
            start ++;
            end --;
        }
        return true;
    }

}
