package dsa.problems.string;

public class ImplementStrStr {
    public int findSubstring(String str,String reqString){
        for(int i = 0; i <= str.length()-reqString.length(); i++){
            int j = 0;
            while(j < reqString.length() && str.charAt(i+j) == reqString.charAt(j)){
                j++;
            }
            if(j == reqString.length())return i;
        }
        return -1;
    }
}
