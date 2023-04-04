package lv1.컨트롤제트;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int solution(String s) {
        List<Integer> answer = new ArrayList<>();
        String[] stk = s.split(" ");
        for(String c: stk){
            if(c.equals("Z")) {
                if (answer.size() > 0)
                    answer.remove(answer.size() - 1);
            } else {
                answer.add(Integer.parseInt(c));
            }
        }

        return answer.stream().mapToInt(Integer::intValue).sum();
    }
}
