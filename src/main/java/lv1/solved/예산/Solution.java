package lv1.solved.예산;

import java.util.Arrays;

public class Solution {
    public int solution(int[] d, int budget) {
        int total = 0;
        Arrays.sort(d);

        for(int i=0 ; i<d.length ; i++){
            if(total + d[i] > budget)
                return i;
            if(total + d[i] == budget)
                return i + 1;

            total += d[i];
        }

        return d.length;
    }
}
