package lv1.내적;

public class Solution {
    public long solution(int[] a, int[] b) {
        long answer = 0;

        for(int i=0 ; i<a.length ; i++)
            answer += (long)a[i] * b[i];

        return answer;
    }
}
