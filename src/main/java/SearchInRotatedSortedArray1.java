/**
 * packageName    : PACKAGE_NAME
 * fileName       : SearchinRotatedSortedArray1
 * author         : AngryPig123
 * date           : 24. 10. 15.
 * description    : LeetCode 33
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 24. 10. 15.        AngryPig123       최초 생성
 */
public class SearchInRotatedSortedArray1 {

    public static void main(String[] args) {
        System.out.println(searchInRotatedSortedArray1(new int[]{4, 5, 6, 7, 0, 1, 2}, 0));
    }

    public static int searchInRotatedSortedArray1(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int middle = left + (right - left) / 2;
            if (nums[middle] == target) return middle;
            if (nums[left] == target) return left;
            if (nums[right] == target) return right;
            if (nums[left] <= nums[middle]) {
                if (target >= nums[left] && target < nums[middle]) {
                    right = middle - 1;
                } else {
                    left = middle + 1;
                }
            } else {
                if (target > nums[middle] && target <= nums[right]) {
                    left = middle + 1;
                } else {
                    right = middle - 1;
                }
            }
        }
        return -1;
    }

}
