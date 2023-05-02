package lv0.크기가작은부분문자열;

public class Solution {
    public int solution(String t, String p) {
        int answer = 0;

        for(int i=0 ; i <= t.length()-p.length() ; i++)
            if(Integer.parseInt(t.substring(i,i+p.length())) <= Integer.parseInt(p))
                answer++;

        return answer;
    }
}
