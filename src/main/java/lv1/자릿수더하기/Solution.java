package lv1.자릿수더하기;

public class Solution {
    public int solution(int n) {
        String[] strList = String.valueOf(n).split("");
        int answer = 0;

        for(String k : strList){
            answer += Integer.parseInt(k);
        }
        return answer;
    }
}
