package dsa.problems.hashMap;

public class SubArraySum {
    public int  sumArray(int[] ar, int k){
        int count = 0;
        int goFwd = 0;
        int sum = 0;
        for (int j : ar) {
            sum += j;
            System.out.println("Sum : "+sum);
            if (sum > k) {
                sum -= ar[goFwd];
                System.out.println("Updated Sum : "+sum);
                goFwd++;
            }
            if (j == k) {
                System.out.println("Count updated in 'j == k'");
                count++;
            }
            if (sum == k) {
                System.out.println("Count updated in 'sum == k'");
                count++;
            }
        }
        return count;
    }
}
