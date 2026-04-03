package dsa.problems.recursion;

public class Fibonacci {
    public int findFibonacci(int num){
        if (num == 0){
            return 0;
        }
        if (num == 1){
            return 1;
        }
        return findFibonacci(num - 1) + findFibonacci(num - 2);
    }
}
