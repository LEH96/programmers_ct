package lv1.게임369;

public class Solution {
    public int solution(int order) {
        int answer = 0;

        while(order > 0){
            if("369".contains(order%10+"")){
                answer += 1;
            }
            order = order / 10;
        }

        return answer;
    }
}
