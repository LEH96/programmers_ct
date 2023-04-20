package lv1.solved.콜라츠추측;

public class Solution {
    public int solution(long num) {
        int answer = 0;

        while(num != 1 && answer < 500) {
            if(num % 2 == 0) { num/=2; }
            else { num = num * 3 + 1; }
            answer++;
        }

        return answer == 500 ? -1 : answer;
    }
}
