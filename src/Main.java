//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import dsa.problems.arrays.*;
import dsa.problems.hashMap.ContainDuplicateII;
import dsa.problems.hashMap.FirstUniqueCharacter;
import dsa.problems.hashMap.TwoSum;
import dsa.problems.string.ImplementStrStr;
import dsa.problems.string.LongestPrefix;
import dsa.problems.string.Palindrome;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] ar = { 2, 4, 3, 7, 5};
        TwoSum sum = new TwoSum();

        System.out.println("**====Two Sum====**");
        System.out.println("Result : "+Arrays.toString(sum.twoSum(ar,9)));
        System.out.println("**===============**");

        Palindrome palindrome = new Palindrome();
        String word = "god";
        System.out.println("**====Palindrome====**");
        System.out.println("Palindrome Check : "+palindrome.checkPalindrome(word));
        System.out.println("**==================**");

        MaximumSubarray maximumSubarray = new MaximumSubarray();
        System.out.println("**====Max Subarray====**");
        System.out.println("Max Subarray : "+maximumSubarray.maxSubarray(ar));
        System.out.println("**==================**");

        Duplicate duplicate = new Duplicate();
        System.out.println("**====Duplicate Check====**");
        System.out.println("Result : "+duplicate.isDuplicateBySorting(ar));
        System.out.println("Result : "+duplicate.isDuplicateWithList(ar));
        System.out.println("**=======================**");

        ArrayProduct arrayProduct = new ArrayProduct();
        System.out.println("**====Product of Array====**");
        System.out.println("Result : "+ Arrays.toString(arrayProduct.product(ar)));
        System.out.println("**========================**");

        int[] ar2 = {7, 1, 5, 3, 6, 4};
        BuyStock buyStock = new BuyStock();
        System.out.println("**====Buy or Sell Stock====**");
        System.out.println("Result : "+ buyStock.buyTheStock(ar2));
        System.out.println("**==========================**");

        String[] str = {"flower", "flow", "flowt"};
        LongestPrefix longestPrefix = new LongestPrefix();
        System.out.println("**====Longest Prefix====**");
        System.out.println("Result : "+ longestPrefix.findLongestPrefix(str));
        System.out.println("**==========================**");

        int[] ar3 = {1, 2, 3, 1};
        ContainDuplicateII containDuplicateII = new ContainDuplicateII();
        System.out.println("**====Contain Duplicate II====**");
        System.out.println("Result : "+ containDuplicateII.checkDuplicate(ar3,2));
        System.out.println("**==========================**");

        String uniqueChar = "Leetcode";
        FirstUniqueCharacter firstUniqueCharacter = new FirstUniqueCharacter();
        System.out.println("**====First Unique Character====**");
        System.out.println("Result : "+ firstUniqueCharacter.findCharacter(uniqueChar));
        System.out.println("**==============================**");

        ImplementStrStr implementStrStr = new ImplementStrStr();
        System.out.println("**====Implement Str Str====**");
        System.out.println("Result : "+ implementStrStr.findSubstring(uniqueChar,"code"));
        System.out.println("**==============================**");

        int[] water = {1,8,6,2,5,4,8,3,7};
        MostWater mostWater = new MostWater();
        System.out.println("**====Most Water in container====**");
        System.out.println("Result : "+ mostWater.mostWater(water));
        System.out.println("**===============================**");
    }
}