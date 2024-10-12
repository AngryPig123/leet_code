/**
 * packageName    : PACKAGE_NAME
 * fileName       : LongestCommonPrefix1
 * author         : AngryPig123
 * date           : 24. 10. 12.
 * description    : LeetCode 14
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 24. 10. 12.        AngryPig123       최초 생성
 */
public class LongestCommonPrefix1 {

    public static void main(String[] args) {
        System.out.println(bestLongestCommonPrefix(new String[]{"flower", "flow", "flight"}));
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        int minLen = Integer.MAX_VALUE;
        for (String str : strs) {
            minLen = Math.min(minLen, str.length());
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < minLen; i++) {
            char commonChar = strs[0].charAt(i);
            boolean isCommon = true;
            for (int j = 1; j < strs.length; j++) {
                if ((commonChar ^ strs[j].charAt(i)) != 0) {
                    isCommon = false;
                    break;
                }
            }
            if (isCommon) {
                result.append(commonChar);
            } else {
                break;
            }
        }
        return result.toString();
    }

    public static String bestLongestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        String prefix = strs[0];
        for (String str : strs) {
            while (str.indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }   //  strs[0] 을 기준으로 길이를 줄여가면서 비교한다.

}
