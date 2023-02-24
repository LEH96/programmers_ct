package lv0.양꼬치;

public class Solution {
        public int solution(int n, int k) {
            int bonus = n / 10;
            int answer = n * 12000 + (k-bonus) * 2000;
            return answer;
        }
}
