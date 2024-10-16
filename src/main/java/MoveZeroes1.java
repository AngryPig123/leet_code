import java.util.*;

/**
 * packageName    : PACKAGE_NAME
 * fileName       : MoveZeroes1
 * author         : AngryPig123
 * date           : 24. 10. 17.
 * description    : LeetCode 283
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 24. 10. 17.        AngryPig123       최초 생성
 */
public class MoveZeroes1 {

    public static void main(String[] args) {

    }

    public void moveZeroes1(int[] nums) {
        int lastIndex = nums.length - 1;
        for (int i = 0; i < lastIndex; i++) {
            if (nums[i] == 0) {
                for (int j = i; j < lastIndex; j++) {
                    nums[j] = nums[j + 1];
                }
                nums[lastIndex] = 0;
                lastIndex--;
                i--;
            }
        }
    }

    public void moveZeroes2(int[] nums) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[index] = nums[i];
                index++;
            }
        }
        for (int i = index; i < nums.length; i++) {
            nums[i] = 0;
        }
    }

    public void moveZeroes3(int[] nums) {
        Queue<Integer> queue = new LinkedList<>();
        for (int value : nums) {
            boolean zero = value == 0;
            if (!zero) {
                queue.add(value);
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (!queue.isEmpty()) {
                nums[i] = queue.poll();
            } else {
                nums[i] = 0;
            }
        }
    }

}
