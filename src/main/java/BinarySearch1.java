/**
 * packageName    : PACKAGE_NAME
 * fileName       : RepeatedDNASequences1
 * author         : AngryPig123
 * date           : 24. 10. 12.
 * description    : LeetCode 704
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 24. 10. 15.        AngryPig123       최초 생성
 */
public class BinarySearch1 {

    public static void main(String[] args) {
        int[] nums = new int[]{-1, 0, 3, 5, 9, 12};
        System.out.println(search(nums, 9));
    }

    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int point = (right + left) / 2;
            if (nums[point] > target) {
                right = point - 1;
            } else if (nums[point] < target) {
                left = point + 1;
            }
            if (nums[point] == target) return point;
        }
        return -1;
    }

}
