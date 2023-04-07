package lv1.등수매기기;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution {
    public int[] solution(int[][] score) {
        int[] rank = new int[score.length];
        for(int i=0;i<score.length;i++){
            rank[i] = (score[i][0] + score[i][1]) / 2;
        }
        Arrays.sort(rank);

        List<Integer> rankDict = new ArrayList<>();
        for(int i : rank){
            if(){
                if(!rankDict.contains(i)){
                    rank
                }
            }
        }
        rankDict = {}
        for i in range(len(rank)):
        if rank.count(rank[i]) > 1:
        if rank[i] not in rankDict:
        rankDict[rank[i]] = i + 1
            else:
        rankDict[rank[i]] = i + 1

        return [rankDict[sum(s) / 2] for s in score]
    }
}
