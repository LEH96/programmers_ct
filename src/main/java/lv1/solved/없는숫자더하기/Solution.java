package lv1.solved.없는숫자더하기;


public class Solution {
    public int solution(int[] numbers) {
        int sum = (0 + 9) * 10 / 2;
        for(int n : numbers)
            sum -= n;
        return sum;
    }
}
