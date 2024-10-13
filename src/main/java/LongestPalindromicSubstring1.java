/**
 * packageName    : PACKAGE_NAME
 * fileName       : LogestPalindromicSubstring1
 * author         : AngryPig123
 * date           : 24. 10. 14.
 * description    : LeetCode 5
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 24. 10. 14.        AngryPig123       최초 생성
 */
public class LongestPalindromicSubstring1 {

    //  1 <= s.length <= 1000
    //  s consist of only digits and English letters.

    public static void main(String[] args) {

    }

    public String longestPalindrome1(String s) {
        int left = 0;
        int right = 0;
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            left = i;
            right = i;
            while (isaBoolean(s, left, right)) {
                String palindrome = s.substring(left, right + 1);
                if (palindrome.length() > result.length()) {
                    result = palindrome;
                }
                left--;
                right++;
            }
            left = i;
            right = i + 1;
            while (isaBoolean(s, left, right)) {
                String palindrome = s.substring(left, right + 1);
                if (palindrome.length() > result.length()) {
                    result = palindrome;
                }
                left--;
                right++;
            }
        }
        return result;
    }

    private static boolean isaBoolean(String s, int left, int right) {
        return left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right);
    }

    int start = 0, end = 0;

    public String longestPalindrome2(String s) {
        for (int i = 0; i < s.length(); i++) {
            expandAroundCenter(s, i, i);
            expandAroundCenter(s, i, i + 1);
        }
        return s.substring(start, end + 1);
    }

    private void expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        left = left + 1;
        right = right - 1;
        if (end - start + 1 < right - left + 1) {
            start = left;
            end = right;
        }
    }

}
