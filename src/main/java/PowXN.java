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
        System.out.println(myPow(2.1, 3));
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
    }

    public double bestMyPow(double x, int n) {
        long num = Math.abs((long) n);
        double result = 1.0;
        while (num != 0) {
            if (num % 2 == 1) { // if n is an odd number
                result = result * x;
                num = num - 1;
            }
            x = x * x;
            num = num / 2;
        }
        return n < 0 ? 1.0 / result : result;
    }

}
