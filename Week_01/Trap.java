package Week_01;

public class Trap {
    public int trap(int[] height) {
        int[] left = new int[height.length];// 当前柱子的左边最高柱子高度
        int[] right = new int[height.length];// 当前柱子的右边最高柱子高度
        int leftMax = 0, rightMax = 0, sum = 0;
        // 计算左/右最高柱子高度数组
        for (int i = 0; i < height.length; i++) {
            if (height[i] > leftMax) {
                leftMax = height[i];
            }
            left[i] = leftMax;
            if (height[height.length - 1 - i] > rightMax) {
                rightMax = height[height.length - 1 - i];
            }
            right[height.length - 1 - i] = rightMax;
        }
        // 当前柱子上有多少水
        for (int j = 0; j < height.length; j++) {
            if (left[j] > height[j] && right[j] > height[j]) {
                sum += Math.min(left[j], right[j]) - height[j];
            }
        }
        return sum;
    }
}