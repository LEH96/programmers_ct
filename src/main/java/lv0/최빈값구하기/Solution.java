package lv0.최빈값구하기;

import java.util.*;

public class Solution {
    public int solution(int[] array) {
        Map<Integer, Integer> cntMap = new LinkedHashMap<>();
        int maxCnt = 0;
        int answer = 0;

        for(int num : array){
            int count = cntMap.getOrDefault(num, 0) + 1;

            if(count > maxCnt) { maxCnt = count; answer = num; }
            else if(count == maxCnt){ answer = -1; }

            cntMap.put(num, count);
        }

        return answer;
    }
}
