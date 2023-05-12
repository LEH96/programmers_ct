package lv1.실패율;

import java.util.*;

public class Solution {
    public int[] solution(int N, int[] stages) {
        int total_stage = stages.length;
        TreeMap<Double, Integer> failRate = new TreeMap<>();

        for(int stage=1 ; stage<=N ; stage++){
            int cnt = 0;
            for(int s : stages)
                if(s == stage)
                    cnt++;

            if(total_stage > 0)
                failRate.put((double)(cnt / total_stage), stage);
            else
                failRate.put(0.0, stage);

            total_stage -= cnt;
        }


    }
}
