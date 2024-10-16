/**
 * packageName    : PACKAGE_NAME
 * fileName       : BestTImeToBuyAndSellStock1
 * author         : AngryPig123
 * date           : 24. 10. 17.
 * description    : LeetCode 121
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 24. 10. 17.        AngryPig123       최초 생성
 */
public class BestTimeToBuyAndSellStock1 {

    public static void main(String[] args) {

    }

    public int maxProfit1(int[] prices) {
        return 0;
    }

    public int maxProfit2(int[] prices) {
        if (prices.length == 0) return 0;
        int price = 0;
        int buy = prices[0];
        for (int i = 1; i < prices.length; i++) {
            price = Math.max(price, prices[i] - buy);
            if (buy > prices[i]) {
                buy = prices[i];
            }
        }
        return price;
    }

}
