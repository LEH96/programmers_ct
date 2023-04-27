package lv1.solved.같은숫자는싫어;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int[] solution(int []arr) {
        List<Integer> answer = new ArrayList<>();
        answer.add(arr[0]);

        for(int i=1 ; i<arr.length ; i++)
            if(arr[i] != arr[i-1])
                answer.add(arr[i]);

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
