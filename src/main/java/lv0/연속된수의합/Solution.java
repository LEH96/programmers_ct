package lv0.연속된수의합;

public class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int min = 0;
        int max = total/num + num/2 + 1;

        if(num % 2 == 1) {
            min = total / num - num / 2;
        } else {
            min = total / num - num / 2 + 1;
        }

        for(int i = 0;i<max-min;i++){
            answer[i] = min+i;
        }
        return answer;
    }
}
