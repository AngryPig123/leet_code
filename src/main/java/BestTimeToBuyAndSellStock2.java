/**
 * packageName    : PACKAGE_NAME
 * fileName       : BestTImeToBuyAndSellStock2
 * author         : AngryPig123
 * date           : 24. 10. 17.
 * description    : LeetCode 122
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 24. 10. 19.        AngryPig123       최초 생성
 */
public class BestTimeToBuyAndSellStock2 {

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
    }

    public static int maxProfit(int[] prices) {
        int result = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            if (prices[i] < prices[i + 1]) {
                result = result + prices[i + 1] - prices[i];
            }
        }
        return result;
    }

}
