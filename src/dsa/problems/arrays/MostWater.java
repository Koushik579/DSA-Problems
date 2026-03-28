package dsa.problems.arrays;

import static java.lang.Math.min;

public class MostWater {
    public int mostWater(int[] ar){
        int maxWater = 0;
        int start = 0;
        int end = ar.length-1;

        while(end > start){
            int checkWater = (end -start) * min(ar[start],ar[end]);
            if(checkWater > maxWater){
                maxWater = checkWater;
            }
            if(ar[start] < ar[end])start ++;
            else end --;
        }

        return maxWater;
    }
}
