import java.util.Arrays;
import java.util.Map;
import java.util.OptionalInt;
import java.util.Scanner;

// Best Time to Buy and Sell Stock
// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
public class BestTimeBuySellStock {
    static Scanner sc= new Scanner(System.in);
    static void main() {
        int[] prices = Arrays.stream(sc.nextLine().split(","))
                .map(String::trim)
                .mapToInt(Integer::parseInt)
                .toArray();

        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices){
        int max = 0;
        int min = Integer.MAX_VALUE;

        for(int price : prices){
            if(price<min){
                min = price;
            }else{
                max = Math.max(max,price - min);
            }
        }

        return max;
    }
}
