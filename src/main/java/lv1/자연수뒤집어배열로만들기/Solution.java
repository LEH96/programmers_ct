package lv1.자연수뒤집어배열로만들기;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int[] solution(long n) {
        List<Integer> answer = new ArrayList<>();

        while(n > 0){
            answer.add((int)(n%10));
            n /= 10;
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
