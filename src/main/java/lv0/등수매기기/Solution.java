package lv0.등수매기기;

import java.util.*;

public class Solution {
    public int[] solution(int[][] score) {
        Float[] rank = new Float[score.length];
        for(int i=0;i<score.length;i++){
            rank[i] = (float)(score[i][0] + score[i][1]) / 2;
        }
        Arrays.sort(rank, Collections.reverseOrder());

        Map<Float, Integer> rankDict = new LinkedHashMap<>();
        for(int i=0;i<rank.length;i++){
            if(Collections.frequency(List.of(rank), rank[i]) > 1){
                if(!rankDict.containsKey(rank[i])){
                    rankDict.put(rank[i], i + 1);
                }
            } else {
                rankDict.put(rank[i], i + 1);
            }
        }

        int[] answer = new int[score.length];
        for(int i=0;i<score.length;i++){
            answer[i] = rankDict.get((float)(score[i][0] + score[i][1]) / 2);
        }
        return answer;
    }
}
