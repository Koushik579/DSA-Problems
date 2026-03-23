package dsa.problems.arrays;

public class ArrayProduct {
    public int[] product(int[] ar){
        int[] result = new int[ar.length];
        for (int i = 0; i < ar.length; i++){

            int p = 1;

            for (int j = 0; j < ar.length; j++){

                if(j == i){
                    continue;
                }
                p *= ar[j];

            }
            result[i] = p;
        }
        return result;
    }
}
