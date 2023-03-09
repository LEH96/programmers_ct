package lv1.n의배수고르기;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int[] solution(int n, int[] numlist) {
        List<Integer> arrList = new ArrayList<>();
        for(int num : numlist){
            if(num % n == 0){
                arrList.add(num);
            }
        }

        int[] answer = arrList.stream()
                              .mapToInt(Integer::intValue)
                              .toArray();
        return answer;
    }
}
