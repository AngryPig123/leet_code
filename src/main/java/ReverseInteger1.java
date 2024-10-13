/**
 * packageName    : PACKAGE_NAME
 * fileName       : ReverseInteger1
 * author         : AngryPig123
 * date           : 24. 10. 11.
 * description    : LeetCode 7
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 24. 10. 11.        AngryPig123       최초 생성
 */
public class ReverseInteger1 {

    public static void main(String[] args) {
        System.out.println(reverse(1234));
    }

    public static int reverse(int x) {
        int original = x;
        int result = 0;
        while (original > 0) {
            int digit = original % 10;
            result = result * 10 + digit;
            original /= 10;
        }
        return result;
    }

}
