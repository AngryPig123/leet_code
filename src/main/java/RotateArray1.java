/**
 * packageName    : PACKAGE_NAME
 * fileName       : RotateArray1
 * author         : AngryPig123
 * date           : 24. 10. 17.
 * description    : LeetCode 189
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 24. 10. 19.        AngryPig123       최초 생성
 */
public class RotateArray1 {

    public static void main(String[] args) {
        rotate2(new int[]{1, 2, 3, 4, 5, 6, 7}, 3);
    }

    public void rotate1(int[] nums, int k) {
        k = k % nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void rotate2(int[] nums, int k) {
        //  srcArray의 2번째부터 3개의 요소를 destArray의 1번째부터 복사
        //  System.arraycopy(srcArray, 1, destArray, 1, 3);
        int[] place = new int[nums.length + k];
        k = k % nums.length;
        if (k >= 0) System.arraycopy(nums, nums.length - k, place, 0, k);
        System.arraycopy(nums, 0, place, k, nums.length);
        System.arraycopy(place, 0, nums, 0, nums.length);
    }

}
