package Array.Medium;

public class BestTimeToSellStockII {

    public static int BuyOrSell(int[] prices) {
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                maxProfit += prices[i] - prices[i - 1];
            }
            System.out.println("Day " + i + ": Price = " + prices[i] + ", Max Profit = " + maxProfit);
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        int answer = BuyOrSell(prices);
        System.out.println("Return Value = " + answer);
    }
}
