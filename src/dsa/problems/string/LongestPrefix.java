package dsa.problems.string;

public class LongestPrefix {
    public String findLongestPrefix(String[] ar){
        StringBuilder longPrefix = new StringBuilder();
        char checkChar;
        for(int i=0; i<ar[0].length(); i++){
            checkChar = ar[0].charAt(i);
            for (String s : ar) {
                if (i >= s.length() || s.charAt(i) != checkChar)
                    return longPrefix.toString();
            }
                longPrefix.append(checkChar);
        }
        return longPrefix.toString();
    }

}

