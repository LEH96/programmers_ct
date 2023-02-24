package lv0.배열의평균값;

public class Solution {
        public static double solution(int[] numbers) {
            double sum = 0;
            for(int i=0;i<numbers.length;i++) {
                sum+=numbers[i];
            }

            double answer = sum/numbers.length;
            return answer;
        }
}
