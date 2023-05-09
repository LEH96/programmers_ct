package lv1.과일장수;

import java.util.*;

public class Solution {
    public int solution(int k, int m, int[] score) {
        List<Integer> box = new ArrayList<>();
        Arrays.sort(score);
        for i in range(0,len(score),m):
            if i+m <= len(score):
                box.append(score[i:i+m])

        int cost = 0;
        for i in range(len(box)):
            cost += min(box[i]) * len(box[i])

        return cost;
    }
}
