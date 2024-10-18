/**
 * packageName    : PACKAGE_NAME
 * fileName       : LengthOfLastWord1
 * author         : AngryPig123
 * date           : 24. 10. 19.
 * description    : LeetCode 58
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 24. 10. 19.        AngryPig123       최초 생성
 */
public class LengthOfLastWord1 {
    public static void main(String[] args) {

    }

    public int lengthOfLastWord1(String s) {
        int length = s.length();
        int size = 0;
        boolean blankPoint = true;
        for (int i = length - 1; i >= 0; i--) {
            if (blankPoint) {
                if (s.charAt(i) != ' ') {
                    blankPoint = false;
                    size++;
                }
            } else {
                if (s.charAt(i) != ' ') {
                    size++;
                } else {
                    break;
                }
            }
        }
        return size;
    }

    public int lengthOfLastWord2(String s) {
        int right = s.length() - 1;
        while (right >= 0 && s.charAt(right) == ' ') {
            right--;
        }
        int left = right;
        while (left >= 0 && s.charAt(left) != ' ') {
            left--;
        }
        return right - left;
    }

}
