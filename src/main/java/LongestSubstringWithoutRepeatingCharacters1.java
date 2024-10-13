import java.util.HashMap;
import java.util.Map;

/**
 * packageName    : PACKAGE_NAME
 * fileName       : LongestSubstringWithoutRepeatingCharacters1
 * author         : AngryPig123
 * date           : 24. 10. 14.
 * description    : LeetCode 3
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 24. 10. 14.        AngryPig123       최초 생성
 */
public class LongestSubstringWithoutRepeatingCharacters1 {

    public static void main(String[] args) {

    }

    public int lengthOfLongestSubstring1(String s) {
        int result = 0;
        Map<Character, Integer> map = new HashMap<>();
        int left = 0;
        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);
            if (!map.containsKey(ch)) {
                map.put(ch, right);
            } else {
                left = Math.max(left, map.get(ch) + 1);
                map.put(ch, right);
            }
            result = Math.max(result, right - left + 1);
        }
        return result;
    }


}
