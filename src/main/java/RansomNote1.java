/**
 * packageName    : PACKAGE_NAME
 * fileName       : LogestPalindromicSubstring1
 * author         : AngryPig123
 * date           : 24. 10. 18.
 * description    : LeetCode 383
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 24. 10. 18.        AngryPig123       최초 생성
 */
public class RansomNote1 {

    public static void main(String[] args) {

        System.out.println('z' - 'a');

    }


    public boolean canConstruct(String ransomNote, String magazine) {
        int[] ransomChar = new int[26];
        int[] magazineChar = new int[26];
        for (int i = 0; i < ransomNote.length(); i++) {
            ransomChar[ransomNote.charAt(i) - 'a']++;
        }
        for (int i = 0; i < magazine.length(); i++) {
            magazineChar[magazine.charAt(i) - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (ransomChar[i] > magazineChar[i]) {
                return false;
            }
        }
        return true;
    }

}
