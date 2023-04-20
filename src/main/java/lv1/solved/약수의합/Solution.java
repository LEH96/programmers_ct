package lv1.solved.약수의합;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int solution(int n) {
        List<Integer> answer = new ArrayList<>();
        for(int i=1 ; i <= n ; i++){
            if(n % i == 0)
                answer.add(i);
        }

        return answer.stream().mapToInt(Integer::intValue).sum();
    }
}
