package lv1.solved.모의고사;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public int[] solution(int[] answers) {
        int[] score = {0,0,0};
        int[] sol1 = {1,2,3,4,5};
        int[] sol2 = {2,1,2,3,2,4,2,5};
        int[] sol3 = {3,3,1,1,2,2,4,4,5,5};

        //점수 계산
        for(int i=0 ; i< answers.length ; i++) {
            if (sol1[i % 5] == answers[i])
                score[0] += 1;
            if (sol2[i % 8] == answers[i])
                score[1] += 1;
            if (sol3[i % 10] == answers[i])
                score[2] += 1;
        }

        //점수 비교
        List<Integer> answer = new ArrayList<>();
        for(int i=0 ; i<3 ; i++)
            if(score[i] == Arrays.stream(score).max().getAsInt())
                answer.add(i+1);

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
