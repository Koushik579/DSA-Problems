package dsa.problems.arrays;

import java.util.Arrays;

public class TwoDuplicates {
    public int findNewLength(int[] ar) {
        int pointer = 0;
        for (int i = 0; i < ar.length; i++) {
            if (pointer < 2 || ar[i] != ar[pointer - 2]) {
                ar[pointer] = ar[i];
                pointer++;
                System.out.println(Arrays.toString(ar));
            }
        }
        System.out.println(Arrays.toString(ar));
        return pointer;
    }
}
