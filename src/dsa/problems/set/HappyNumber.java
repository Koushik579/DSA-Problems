package dsa.problems.set;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
    public boolean isHappyNumber(int num){
        Set<Integer> numbers = new HashSet<>();
        numbers.add(num);
        while(true){
            int sum = 0;
            while(num != 0){
                sum += (int) Math.pow(num % 10,2);
                num = num/10;
            }
            num = sum;
            if (sum == 1){
                return true;
            }
            if (numbers.contains(num)){
                return false;
            }
            numbers.add(sum);
        }
    }
}
