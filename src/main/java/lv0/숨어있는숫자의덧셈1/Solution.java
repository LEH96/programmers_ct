package lv0.숨어있는숫자의덧셈1;

public class Solution {
    public int solution(String my_string) {
        int answer = 0;
        for(int i=0;i<my_string.length();i++){
            int n = my_string.substring(i,i+1).charAt(0) - '0';
            if(0 <= n && n <= 9)
                answer += n;
        }
        return answer;
    }
}
