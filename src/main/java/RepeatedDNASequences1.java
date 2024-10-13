import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * packageName    : PACKAGE_NAME
 * fileName       : RepeatedDNASequences1
 * author         : AngryPig123
 * date           : 24. 10. 12.
 * description    : LeetCode 187
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 24. 10. 14.        AngryPig123       최초 생성
 */
public class RepeatedDNASequences1 {

    public static void main(String[] args) {
        System.out.println(bestRepeatedDNASequences1("AAAAAAAAAAA"));
    }

    public static List<String> bestRepeatedDNASequences1(String s) {
        Map<String, Integer> map = new HashMap<>();
        int repeatLength = s.length() - 10;
        for (int i = 0; i <= repeatLength; i++) {
            String subString = s.substring(i, i + 10);
            map.put(subString, map.getOrDefault(subString, 0) + 1);
        }
        List<String> result = new ArrayList<>();
        for (Map.Entry<String, Integer> item : map.entrySet()) {
            if (item.getValue() >= 1) {
                result.add(item.getKey());
            }
        }
        return result;
    }

}
