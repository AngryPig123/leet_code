import java.util.*;

/**
 * packageName    : PACKAGE_NAME
 * fileName       : ValidAnagram1
 * author         : AngryPig123
 * date           : 24. 10. 13.
 * description    : LeetCode 242
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 24. 10. 13.        AngryPig123       최초 생성
 */
public class ValidAnagram1 {

    public static void main(String[] args) {
        System.out.println((int) 'a');
    }

    public boolean isAnagram1(String s, String t) {
        if (s.length() != t.length()) return false;
        List<Character> sList = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            sList.add(s.charAt(i));
        }
        sList = sList.stream().sorted().toList();

        List<Character> tList = new ArrayList<>();
        for (int i = 0; i < t.length(); i++) {
            tList.add(t.charAt(i));
        }
        sList = sList.stream().sorted().toList();
        for (int i = 0; i < sList.size(); i++) {
            if (sList.get(i) != tList.get(i)) {
                return false;
            }
        }
        return true;
    }

    public boolean isAnagram2(String s, String t) {
        if (s.length() != t.length()) return false;
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            int i1 = t.indexOf(currentChar);
            if (i1 != -1) {
                StringBuilder sb = new StringBuilder(t);
                sb.deleteCharAt(i1);
                t = sb.toString();
            }
        }
        return t.isEmpty();
    }

    public boolean isAnagram3(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) - 1);
            } else {
                return false;
            }
        }
        return map.values().stream().allMatch(item -> item == 0);
    }

    public boolean isAnagram4(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] valid = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char sCh = s.charAt(i);
            char tCh = t.charAt(i);
            int sIndex = sCh - 97;
            int tIndex = tCh - 97;
            valid[sIndex] += 1;
            valid[tIndex] -= 1;
        }
        for (int j : valid) {
            if (j != 0) {
                return false;
            }
        }
        return true;
    }

    public boolean bestIsAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] table = new int[26];
        for (int i = 0; i < s.length(); i++) {
            table[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            table[t.charAt(i) - 'a']--;
            if (table[t.charAt(i) - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }

}
