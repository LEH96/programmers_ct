package lv1.solved.두개뽑아서더하기;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int[] solution(int[] numbers) {
        List<Integer> answer = new ArrayList<>();
        for(int i=0 ; i < numbers.length ; i++){
            for(int j=i+1 ; j < numbers.length ; j++){
                int sum = numbers[i] + numbers[j];
                if(!answer.contains(sum))
                    answer.add(sum);
            }
        }

        return answer.stream().mapToInt(Integer::intValue).sorted().toArray();
    }
}
