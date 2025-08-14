package Arrays;

public class StockProlem {
    static public int maxProfit(int[] arr){
        int max_profit = 0;
        int low = arr[0];
        for(int i = 1; i < arr.length; i++){
            low = Math.min(low, arr[i]);
            max_profit = Math.max(max_profit, arr[i] - low);
        }
        return max_profit;
    }

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
}
