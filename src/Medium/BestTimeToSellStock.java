package Medium;

public class BestTimeToSellStock {


    public static int BuyOrSell(int[] prices) {
        int lowestPrice = prices[0];
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            maxProfit = Math.max(maxProfit, prices[i] - lowestPrice);
            lowestPrice = Math.min(lowestPrice, prices[i]);
            System.out.println("Day " + i + ": Price = " + prices[i] + ", Lowest = " + lowestPrice + ", Max Profit = " + maxProfit);
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = {7,6,4,3,1};
        int answer = BuyOrSell(prices);
        System.out.println("Return Value = " + answer);
    }
}
