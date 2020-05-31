package Week_02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class TopKFrequent {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>(16);
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        List<Integer>[] bucket = new List[nums.length + 1];
        for (Integer key : map.keySet()) {
            int freq = map.get(key);
            if (bucket[freq] == null) {
                bucket[freq] = new ArrayList<>();
            }
            bucket[freq].add(key);
        }

        List<Integer> list = new ArrayList<>();
        for (int i = nums.length; i >= 0 && list.size() < k; --i) {
            if (bucket[i] != null) {
                list.addAll(bucket[i]);
            }
        }

        int[] res = list.stream().mapToInt(Integer::valueOf).toArray();
        return res;
    }
}