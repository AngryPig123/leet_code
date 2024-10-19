/**
 * packageName    : PACKAGE_NAME
 * fileName       : JumpGame1
 * author         : AngryPig123
 * date           : 24. 10. 19.
 * description    : LeetCode 55
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 24. 10. 19.        AngryPig123       최초 생성
 */
public class JumpGame1 {

    public static void main(String[] args) {
        System.out.println(jumpGame1(new int[]{1}));
    }

    public static boolean jumpGame1(int[] nums) {
        int maxReach = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > maxReach) return false;
            maxReach = Math.max(maxReach, i + nums[i]);
            if (maxReach >= nums.length - 1) return true;
        }
        return true;
    }

}
