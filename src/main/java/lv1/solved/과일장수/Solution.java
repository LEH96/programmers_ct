package lv1.solved.과일장수;

import java.util.*;

public class Solution {
    public int solution(int k, int m, int[] score) {
        List<int[]> box = new ArrayList<>();
        Arrays.sort(score);

        for(int i=score.length ; i>=0 ; i-=m){
            if(i-m >= 0)
                box.add(Arrays.copyOfRange(score, i-m, i));
        }

        return box.stream()
                .mapToInt(arr -> Arrays.stream(arr).min().orElse(1) * arr.length)
                .sum();
    }
}
