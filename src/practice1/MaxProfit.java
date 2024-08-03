package practice1;

public class MaxProfit {
    public static void main(String[] args) {
//        int[] prices = {110, 12, 70, 15, 99, 7, 21, 17}; // output(1,4)
        int[] prices = {14, 70, 12, 15, 90, 65, 21, 99}; // output : (2,7)
        int[] result = findMaxProfit(prices);
        if (result != null) {
            int buyIndex = result[0];
            int sellIndex = result[1];
            int maxProfit = result[2];
            System.out.println("Buy at index: " + buyIndex + ", Sell at index: " + sellIndex + ", Max Profit: " + maxProfit);
        } else {
            System.out.println("No profit can be made.");
        }
    }

    public static int[] findMaxProfit(int[] prices) {
        if (prices == null || prices.length < 2) {
            return null; // At least two prices are needed to make a profit
        }
        int buyIndex = 0;
        int sellIndex = 0;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) { //14, 70, 12, 15, 90, 65, 21, 99
            for (int j = i + 1; j < prices.length; j++) {
                int profit = prices[j] - prices[i];
                if (profit > maxProfit) {
                    maxProfit = profit;
                    buyIndex = i;
                    sellIndex = j;
                }
            }
        }
        if (maxProfit == 0) {
            return null; // No profit can be made
        }
        return new int[]{buyIndex, sellIndex, maxProfit};
    }
}

