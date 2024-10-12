import java.util.HashMap;
import java.util.Map;

/**
 * packageName    : PACKAGE_NAME
 * fileName       : RomanToInteger1
 * author         : AngryPig123
 * date           : 24. 10. 12.
 * description    : LeetCode 13
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 24. 10. 12.        AngryPig123       최초 생성
 */
public class RomanToInteger1 {

    public static void main(String[] args) {
        System.out.println(romanToInt("DCCCCLXXXXIIII"));
    }

    public static int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int result = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            int cur = map.get(s.charAt(i));
            int next = map.get(s.charAt(i + 1));
            if (cur < next) {
                result -= cur;
            } else {
                result += cur;
            }
        }
        return result + map.get(s.charAt(s.length() - 1));
    }

}
