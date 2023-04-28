package lv1.solved.예산;

import java.util.Arrays;

public class Solution {
    public int solution(int[] d, int budget) {
        int total = 0;
        Arrays.sort(d);

        for(int i=0 ; i<d.length ; i++){
            if(total > budget)
                return i-1;
            if(total == budget)
                return i;

            total += d[i];
        }

        return total > budget ? d.length - 1 : d.length ;
    }
}
