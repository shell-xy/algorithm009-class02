package Week_01;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            int dvalue = target - nums[i];
            if (map.containsKey(dvalue)) {
                return new int[] { map.get(dvalue), i };
            }
            map.put(nums[i], i);
        }
        return null;
    }
}