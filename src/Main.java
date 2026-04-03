//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import dsa.problems.arrays.*;
import dsa.problems.hashMap.*;
import dsa.problems.recursion.Factorial;
import dsa.problems.recursion.Fibonacci;
import dsa.problems.string.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        TwoSum sum = new TwoSum();
        System.out.println("**====Two Sum for Sorted Array====**");
        System.out.println("Result : "+Arrays.toString(sum.twoSum(new int[] {2, 3, 4, 5, 7},9)));
        System.out.println("**===============**");

        TwoSumII sumII = new TwoSumII();
        System.out.println("**====Two Sum II====**");
        System.out.println("Result : "+Arrays.toString(sumII.twoSum(new int[] {2, 4, 3, 7, 5},9)));
        System.out.println("**===============**");

        Palindrome palindrome = new Palindrome();
        String word = "god";
        System.out.println("**====Palindrome====**");
        System.out.println("Palindrome Check : "+palindrome.checkPalindrome(word));
        System.out.println("**==================**");

        MaximumSubarray maximumSubarray = new MaximumSubarray();
        System.out.println("**====Max Subarray====**");
        System.out.println("Max Subarray : "+maximumSubarray.maxSubarray(new int[] {2, 4, 3, 7, 5}));
        System.out.println("**==================**");

        Duplicate duplicate = new Duplicate();
        System.out.println("**====Duplicate Check====**");
        System.out.println("Result : "+duplicate.isDuplicateBySorting(new int[] {2, 4, 3, 7, 5}));
        System.out.println("Result : "+duplicate.isDuplicateWithList(new int[] {2, 4, 3, 7, 5}));
        System.out.println("**=======================**");

        ArrayProduct arrayProduct = new ArrayProduct();
        System.out.println("**====Product of Array====**");
        System.out.println("Result : "+ Arrays.toString(arrayProduct.product(new int[] {2, 4, 3, 7, 5})));
        System.out.println("**========================**");

        BuyStock buyStock = new BuyStock();
        System.out.println("**====Buy or Sell Stock====**");
        System.out.println("Result : "+ buyStock.buyTheStock(new int[] {7, 1, 5, 3, 6, 4}));
        System.out.println("**==========================**");

        LongestPrefix longestPrefix = new LongestPrefix();
        System.out.println("**====Longest Prefix====**");
        System.out.println("Result : "+ longestPrefix.findLongestPrefix(new String[] {"flower", "flow", "float"}));
        System.out.println("**==========================**");

        ContainDuplicateII containDuplicateII = new ContainDuplicateII();
        System.out.println("**====Contain Duplicate II====**");
        System.out.println("Result : "+ containDuplicateII.checkDuplicate(new int[] {1, 2, 3, 1},2));
        System.out.println("**==========================**");

        FirstUniqueCharacter firstUniqueCharacter = new FirstUniqueCharacter();
        System.out.println("**====First Unique Character====**");
        System.out.println("Result : "+ firstUniqueCharacter.findCharacter("Leetcode"));
        System.out.println("**==============================**");

        ImplementStrStr implementStrStr = new ImplementStrStr();
        System.out.println("**====Implement Str Str====**");
        System.out.println("Result : "+ implementStrStr.findSubstring("Leetcode","code"));
        System.out.println("**==============================**");

        MostWater mostWater = new MostWater();
        System.out.println("**====Most Water in container====**");
        System.out.println("Result : "+ mostWater.mostWater(new int[]{1,8,6,2,5,4,8,3,7}));
        System.out.println("**===============================**");

        Anagram anagram = new Anagram();
        System.out.println("**====Check Anagram====**");
        System.out.println("Result : "+ anagram.checkAnagram("ana","naa"));
        System.out.println("**=====================**");

        IntersectionII intersectionII = new IntersectionII();
        System.out.println("**====Array Intersection II====**");
        System.out.println("Result : "+ intersectionII.findIntersection(new int[]{4,9,5},new int[]{9,4,9,5,8,4}));
        System.out.println("**=============================**");

        LongestSubstring longestSubstring = new LongestSubstring();
        System.out.println("**====Longest Substring Without Repeating Characters====**");
        System.out.println("Result : "+ longestSubstring.findLengthOfLongestSubstring("pjwakew"));
        System.out.println("**======================================================**");

        /*SubArraySum subArraySum = new SubArraySum();
        System.out.println("**====Subarray Sum Equals K====**");
        System.out.println("Result : "+ subArraySum.sumArray(new int[]{1,-1,1,1},2));
        System.out.println("**======================================================**");*/

        LongestRepeatingCharacter longestRepeatingCharacter = new LongestRepeatingCharacter();
        System.out.println("**====Longest Repeating Character====**");
        System.out.println("Result : "+ longestRepeatingCharacter.longestRepeat("AABAABA",2));
        System.out.println("**======================================================**");

        Factorial factorial = new Factorial();
        System.out.println("**====Factorial Using Recursion====**");
        int num = 7;
        System.out.print("Factorial of "+num+" : ");
        factorial.factorialOfNumber(num,1);
        System.out.println("**======================================================**");

        Fibonacci fibonacci = new Fibonacci();
        System.out.println("**====Fibonacci Using Recursion====**");
        System.out.println("Fibonacci of "+num+" : " + fibonacci.findFibonacci(num));
        System.out.println("**======================================================**");

    }
}