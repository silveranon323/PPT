package Arrays;

import java.util.*;

public class besttimetobuyandsellstock {
    public static void bestTimeToBuyAndSellStock(int stockPrice[]) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < stockPrice.length; i++) {
            if (buyPrice < stockPrice[i]) {
                int profit = stockPrice[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buyPrice = stockPrice[i];
            }
        }
        System.out.println("The maximum profit that could be achieve using this array is : " + maxProfit);
    }

    public static void main(String[] args) {
        int stockPrice[] = { 7, 1, 5, 3, 6, 4 };
        bestTimeToBuyAndSellStock(stockPrice);
    }
}
