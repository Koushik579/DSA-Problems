//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import dsa.problems.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] ar = {2,7,6,1,5};
        TwoSum sum = new TwoSum();

        System.out.println("**====Two Sum====**");
        System.out.println(Arrays.toString(sum.twoSum(ar,9)));
        System.out.println("**===============**");
    }
}