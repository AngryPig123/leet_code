/**
 * packageName    : PACKAGE_NAME
 * fileName       : FizzBuzz
 * author         : AngryPig123
 * date           : 24. 10. 11.
 * description    : LeetCode 412
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 24. 10. 11.        AngryPig123       최초 생성
 */
public class FizzBuzz1 {

    public static void main(String[] args) {
        String[] strings = fizzBuzz(9);
        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static String[] fizzBuzz(int n) {
        String[] result = new String[n];
        for (int i = 1; i <= n; i++) {
            StringBuilder sb = new StringBuilder();
            if (fizz(i)) {
                sb.append("Fizz");
            }
            if (buzz(i)) {
                sb.append("Buzz");
            }
            if (!fizz(i) && !buzz(i)) {
                sb.append(i);
            }
            result[i - 1] = sb.toString();
        }
        return result;
    }

    private static boolean buzz(int i) {
        return (i / 5 >= 1) && (i % 5 == 0);
    }

    private static boolean fizz(int i) {
        return (i / 3 >= 1) && (i % 3 == 0);
    }

}
