import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * packageName    : PACKAGE_NAME
 * fileName       : ReverseWordsInAString
 * author         : AngryPig123
 * date           : 24. 10. 14.
 * description    : LeetCode 151
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 24. 10. 14.        AngryPig123       최초 생성
 */
public class ReverseWordsInAString1 {

    public static void main(String[] args) {
        System.out.println(reverseWords1("  hello world  "));
    }

    public static String reverseWords1(String s) {
        List<String> answers = new ArrayList<>();
        int index = 0;
        for (int i = 0; i < s.length(); i++) {
            char empty = ' ';
            boolean lastValid = i == s.length() - 1;
            if (s.charAt(i) == empty || lastValid) {
                String answer = s.substring(index, lastValid ? i + 1 : i).replace(" ", "");
                if (!answer.isEmpty()) answers.add(answer);
                if (!(lastValid)) index = i;
            }
        }
        Collections.reverse(answers);
        return String.join(" ", answers);
    }

    public static String reverseWords2(String s) {
        List<String> answers = Arrays.asList(s.trim().split("\\s+"));
        Collections.reverse(answers);
        return String.join(" ", answers);
    }

    public String bestReverseWords(String s) {
        char[] str = s.toCharArray();
        reverse(str, 0, str.length - 1);
        reverseWords(str);
        return cleanSpaces(str);
    }   //  문자열 전체를 뒤집고 공백 처리를 한 후 공백기준으로 나뉜 단어를 뒤집는다.

    private String cleanSpaces(char[] str) {
        int left = 0;
        int right = 0;
        while (right < str.length) {
            while (right < str.length && str[right] == ' ') right++;
            while (right < str.length && str[right] != ' ') {
                str[left] = str[right];
                left++;
                right++;
            }
            while (right < str.length && str[right] == ' ') right++;
            if (right < str.length) {
                str[left] = ' ';
                left++;
            }
        }
        return new String(str).substring(0, left);
    }

    private void reverseWords(char[] str) {
        int left = 0;
        int right = 0;
        while (left < str.length) {
            while (left < str.length && str[left] == ' ') left++;
            right = left;
            while (right < str.length && str[right] != ' ') right++;
            reverse(str, left, right - 1);
            left = right;
        }
    }

    private void reverse(char[] str, int left, int right) {
        while (left < right) {
            char tmp = str[left];
            str[left] = str[right];
            str[right] = tmp;
            left++;
            right--;
        }
    }

}
