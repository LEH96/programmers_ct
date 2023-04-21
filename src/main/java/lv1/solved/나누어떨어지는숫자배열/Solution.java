package lv1.solved.나누어떨어지는숫자배열;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> answer = new ArrayList<>();

        for(int n : arr)
            if(n % divisor == 0)
                answer.add(n);

        if(answer.size() > 0)
            return answer.stream()
                    .sorted().mapToInt(Integer::intValue).toArray();
        else
            return new int[]{-1};
    }
}
