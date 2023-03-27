package lv1.가까운수;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution {
    public int solution(int[] array, int n) {
        int[] sortedArr = Arrays.stream(array).sorted().toArray();
        List<Integer> diff = new ArrayList<>();
        for (int k : sortedArr)
            diff.add(Math.abs(k - n));

        int idx = diff.indexOf(Collections.min(diff));
        return sortedArr[idx];
    }
}
