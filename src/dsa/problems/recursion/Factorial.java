package dsa.problems.recursion;

public class Factorial {
    public int factorialOfNumber(int num){
        if(num == 1){
            System.out.print(num + " : ");
            return 1;
        }
        System.out.print(num + " * ");
        return num * factorialOfNumber(num - 1);
    }
}
