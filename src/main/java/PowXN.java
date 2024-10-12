import java.sql.SQLOutput;

/**
 * packageName    : PACKAGE_NAME
 * fileName       : ReverseInteger1
 * author         : AngryPig123
 * date           : 24. 10. 11.
 * description    : LeetCode 50
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 24. 10. 11.        AngryPig123       최초 생성
 */
public class PowXN {

    public static void main(String[] args) {
        System.out.println(myPow2(729, 5));
        System.out.println(myPow2(9, 15));
        System.out.println(myPow2(3, 30));
    }

    public static double myPow(double x, int n) {
        if (n == 0) return 1.0;
        double result = 1.0;
        if (n > 0) {
            for (int i = 0; i < n; i++) {
                result *= x;
            }
        } else {
            for (int i = n; i < 0; i++) {
                result /= x;
            }
        }
        return result;
    }   //  todo logN

    public static double myPow2(double x, int n) {
        // x^n = 2^10 = 4^5
        // 4 * 4^4 .... result = 4
        // 4^4 = 16^2 .... result = 4
        // 16^2 = 256 * 1 .... result = 4, 256
        // result = 4 * 256
        long num = Math.abs((long) n);
        double result = 1.0;
        while (num != 0) {
            if (num % 2 == 1) {
                result = result * x;
                num = num - 1;
            }
            x = x * x;
            num = num / 2;
        }
        return result;
    }

}
