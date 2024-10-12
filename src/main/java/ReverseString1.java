/**
 * packageName    : PACKAGE_NAME
 * fileName       : ReverseString1
 * author         : AngryPig123
 * date           : 24. 10. 12.
 * description    : 344
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 24. 10. 12.        AngryPig123       최초 생성
 */
public class ReverseString1 {

    public static void main(String[] args) {

    }

    public static void reverseString(char[] s) {
        for (int i = 0; i < s.length / 2; i++) {
            char temp = s[i];
            int changeIndex = s.length - (i + 1);
            s[i] = s[changeIndex];
            s[changeIndex] = temp;
        }
    }

    public static void reverseString2(char[] s) {
        int left = 0;
        int right = s.length - 1;
        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }

}
