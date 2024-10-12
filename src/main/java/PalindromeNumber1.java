/**
 * packageName    : PACKAGE_NAME
 * fileName       : PalindromeNumber1
 * author         : AngryPig123
 * date           : 24. 10. 11.
 * description    : LeetCode 9
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 24. 10. 11.        AngryPig123       최초 생성
 */
public class PalindromeNumber1 {


    public static void main(String[] args) {

    }

    public boolean isPalindrome1(int x) {
        if (x < 0) return false;
        String str = String.valueOf(x);
        int p = str.length() / 2;
        String start = str.substring(0, p);
        String end = str.substring(str.length() % 2 == 0 ? p : p + 1);
        for (int i = 0; i < start.length(); i++) {
            if (start.charAt(i) != end.charAt(start.length() - 1 - i)) return false;
        }
        return true;
    }

    public boolean isPalindrome2(int x) {
        if (x < 0) return false;
        int result = x;
        int reverse = 0;
        while (x > 0) {
            reverse = reverse * 10 + x % 10;
            x = x / 10;
        }
        return result == reverse;
    }

    public boolean bestIsPalindrome(int x) {
        if (x < 0 || (x != 0 && x % 10 == 0)) {
            return false;
        }
        int reversed = 0;
        while (x > reversed) {
            reversed = reversed * 10 + x % 10;
            x /= 10;
        }
        return (x == reversed) || (x == reversed / 10);
    }

}
