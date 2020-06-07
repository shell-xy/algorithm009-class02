package Week_03;

import java.util.LinkedList;
import java.util.List;

class Combine {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new LinkedList<>();
        if (n < k || k <= 0)
            return ans;
        ans = combine(n - 1, k - 1);
        if (ans.isEmpty())
            ans.add(new LinkedList<Integer>());
        for (List<Integer> list : ans)
            list.add(n);
        ans.addAll(combine(n - 1, k));
        return ans;
    }
}