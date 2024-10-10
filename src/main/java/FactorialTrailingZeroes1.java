import java.math.BigInteger;

/**
 * packageName    : PACKAGE_NAME
 * fileName       : FactorialTrailingZeroes1
 * author         : AngryPig123
 * date           : 24. 10. 11.
 * description    : LeetCode 172
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 24. 10. 11.        AngryPig123       최초 생성
 */
public class FactorialTrailingZeroes1 {

    public static void main(String[] args) {
        BigInteger result = BigInteger.ONE;
        for (BigInteger i = BigInteger.ONE; i.compareTo(new BigInteger("30")) < 0; i = i.add(BigInteger.ONE)) {
            result = result.multiply(i);
        }
        System.out.println(result);
    }

    public static int trailingZeroes(int n) {
        int count = 0;
        int currPowerOfFive = 5;
        while (n >= currPowerOfFive) {
            count += (n / currPowerOfFive);
            currPowerOfFive *= 5;
        }
        return count;
    }

}
