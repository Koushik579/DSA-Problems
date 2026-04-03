package dsa.problems.recursion;

public class Factorial {
    public void factorialOfNumber(int num,int initial){
        if(initial == num){
            System.out.print(initial);
            System.out.println();
            return;
        }
        if (initial < num){
            System.out.print(initial+" ");
            factorialOfNumber(num,initial + 1);
        }
    }
}
