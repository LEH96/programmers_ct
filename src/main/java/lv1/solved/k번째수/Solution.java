package lv1.solved.k번째수;

import java.util.Arrays;

public class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for(int i=0 ; i<commands.length ; i++){
            int start = commands[i][0];
            int end = commands[i][1];
            int loc = commands[i][2];

            int[] arr_part = Arrays.stream(array, start - 1, end).sorted().toArray();
            answer[i] = arr_part[loc - 1];
        }
        return answer;
    }
}