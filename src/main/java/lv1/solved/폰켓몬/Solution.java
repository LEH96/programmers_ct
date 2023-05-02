package lv1.solved.폰켓몬;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int solution(int[] nums) {
        Set<Integer> type = new HashSet<>();
        for(int n : nums)
            type.add(n);

        return Math.min(nums.length/2,type.size());
    }
}
