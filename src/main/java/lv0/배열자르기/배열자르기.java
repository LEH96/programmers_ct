package lv0.배열자르기;

public class 배열자르기 {
    public class Solution {
        public int[] solution(int[] numbers, int num1, int num2) {
            int[] answer = new int[num2-num1+1];
            int idx = 0;
            for(int k=num1;k<=num2;k++){
                answer[idx++] = numbers[k];
            }
            return answer;
        }
    }
}
