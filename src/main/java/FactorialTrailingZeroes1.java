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
//        BigInteger result = BigInteger.ONE;
//        for (BigInteger i = BigInteger.ONE; i.compareTo(new BigInteger("30")) <= 0; i = i.add(BigInteger.ONE)) {
//            result = result.multiply(i);
//        }
//        System.out.println(result);

        System.out.println(trailingZeroes(30));

    }

    public static int trailingZeroes(int n) {
        int count = 0;
        int pow = 5;
        while (n >= pow) {
            count += (n / pow);
            pow *= pow;
        }
        return count;
    }
    //  펙토리얼에서 뒤에 0이 붙는 케이스 = 2 * 5,
    //  구조상 5가 몇번 들어가는지 체크해서 count를 늘려주면 된다.
    //  하지만 이때 5의 제곱이 되는 케이스도 고려해야한다.


}
