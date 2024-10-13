import java.util.HashSet;
import java.util.Set;

/**
 * packageName    : PACKAGE_NAME
 * fileName       : SingleNumber1
 * author         : AngryPig123
 * date           : 24. 10. 11.
 * description    : LeetCode 136
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 24. 10. 11.        AngryPig123       최초 생성
 */
public class SingleNumber1 {

    public static void main(String[] args) {

    }

    public int findSingleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.contains(num)) {
                set.add(num);
            } else {
                set.remove(num);
            }
        }
        return set.iterator().next();
    }

    public int bestFindSingleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }

}
