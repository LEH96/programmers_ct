package lv0.특이한정렬;

import java.util.Arrays;

public class Solution {
    public int[] solution(int[] numlist, int n) {
        int[][] diff = new int[numlist.length][2];
        for(int i=0; i<numlist.length ;i++) {
            diff[i][0] = Math.abs(numlist[i] - n);
            diff[i][1] = -numlist[i];
        }
        Arrays.sort(diff,(e1, e2) -> {
            if(e1[0] == e2[0]){
                return Integer.compare(e1[1], e2[1]);
            } else {
                return Integer.compare(e1[0], e2[0]);
            }
        });

        int[] answer = new int[numlist.length];
        for(int i=0; i<numlist.length; i++){
            answer[i] = -diff[i][1];
        }
        return answer;
    }
}
