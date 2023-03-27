package lv1.k의개수;

public class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        for(int n=i;n<=j;n++){
            String num = n+"";
            while(num.contains(k+"")) {
                answer += 1;
                num = num.replace(k+"","");
            }
        }
        return answer;
    }
}
