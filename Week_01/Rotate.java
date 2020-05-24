package Week_01;

//LeetCode 189
public class Rotate {
    public void rotate(int[] nums, int k) {
        k %= nums.length;
        reserve(nums, 0, nums.length - 1);
        reserve(nums, 0, k - 1);
        reserve(nums, k, nums.length - 1);

    }

    private void reserve(int[] nums, int start, int end) {
        while (start < end) {
            int pre = nums[start];
            nums[start] = nums[end];
            nums[end] = pre;
            start++;
            end--;
        }
    }
}