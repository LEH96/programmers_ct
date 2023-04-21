package lv1.solved.제일작은수제거하기;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public int[] solution(int[] arr) {
        int min = Arrays.stream(arr).min().orElse(-1);

        List<Integer> arrToList = Arrays.stream(arr).boxed().collect(Collectors.toList());
        arrToList.remove((Integer) min);

        if(arrToList.size() == 0)
            return new int[]{-1};
        else
            return arrToList.stream().mapToInt(Integer::intValue).toArray();
    }
}
