package lv1.실패율;

public class Solution {
    public int[] solution(int N, int[] stages) {
        int[] rate = new int[N];
        int total_stage = stages.length;

        for(int stage=1 ; stage<=N ; stage++){
            if(total_stage > 0)
                rate[stage] = stages.count(stage) / total_stage;
            else
                rate[stage] = 0;

            total_stage -= stages.count(stage);
        }

        return sorted(rate, key=lambda x:rate[x], reverse=True)
    }
}
