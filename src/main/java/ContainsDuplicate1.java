import java.util.HashSet;
import java.util.Set;

/**
 * packageName    : PACKAGE_NAME
 * fileName       : ContainsDuplicate1
 * author         : AngryPig123
 * date           : 24. 10. 19.
 * description    : LeetCode 217
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 24. 10. 19.        AngryPig123       최초 생성
 */
public class ContainsDuplicate1 {

    public static void main(String[] args) {
        containsDuplicate1(new int[]{1, 2, 3, 1});
    }

    public static boolean containsDuplicate1(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            } else {
                set.add(num);
            }
        }
        return false;
    }

}
