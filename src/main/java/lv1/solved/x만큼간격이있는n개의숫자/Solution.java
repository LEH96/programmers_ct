package lv1.solved.x만큼간격이있는n개의숫자;

public class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];

        while(n > 0) {
            answer[n - 1] = (long)x * n;
            n--;
        }

        return answer;
    }
}
