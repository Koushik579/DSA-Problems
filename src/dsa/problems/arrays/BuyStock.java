package dsa.problems.arrays;

public class BuyStock {
    public int buyTheStock(int[] ar){
        int buyingPrice = ar[0];
        int maxProfit = 0;
        for(int price : ar){
            if(price < buyingPrice){
                buyingPrice = price;
            }
            if((price - buyingPrice) > maxProfit){
               maxProfit = price - buyingPrice;
            }
        }
        return maxProfit;
    }
}
