package Week_06;

public class SplitArray {
    public int splitArray(int[] nums, int m) {
        long max = 0, min = 0;
        for (int num : nums) {
            max += num;
            min = Math.max(num, min);
        }
        return (int) binarySearch(nums, min, max, m);
    }

    private long binarySearch(int[] nums, long min, long max, int m) {
        if (min == max)
            return min;
        long mid = (max - min) / 2 + min;
        if (isValid(nums, mid, m)) {
            if (mid == min || !isValid(nums, mid - 1, m))
                return mid;
            else
                return binarySearch(nums, min, mid - 1, m);
        } else
            return binarySearch(nums, mid + 1, max, m);
    }

    private boolean isValid(int[] nums, long sum, int m) {
        long curSum = 0;
        for (int num : nums) {
            if (curSum + num <= sum) {
                curSum += num;
            } else {
                if ((--m) == 0)
                    return false;
                curSum = num;
            }
        }
        return curSum <= sum;
    }
}