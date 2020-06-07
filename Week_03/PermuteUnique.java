package Week_03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermuteUnique {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums == null || nums.length == 0)
            return res;
        boolean[] used = new boolean[nums.length];
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        findUnique(nums, used, list, res);
        return res;
    }

    public void findUnique(int[] nums, boolean[] used, List<Integer> list, List<List<Integer>> res) {
        if (list.size() == nums.length) {
            res.add(new ArrayList<>(list));
        }
        for (int i = 0; i < nums.length; i++) {
            if (used[i])
                continue;
            if (i > 0 && nums[i - 1] == nums[i] && !used[i - 1])
                continue;
            used[i] = true;
            list.add(nums[i]);
            findUnique(nums, used, list, res);
            used[i] = false;
            list.remove(list.size() - 1);
        }
    }
}