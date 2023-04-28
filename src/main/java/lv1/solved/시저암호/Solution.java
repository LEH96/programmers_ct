package lv1.solved.시저암호;

public class Solution {
    public String solution(String s, int n) {
        StringBuilder answer = new StringBuilder();
        for(char c : s.toCharArray()){
            if('A' <= c && c <='Z' || 'a' <= c && c <='z') {
                if(c <='Z' && c + n > 'Z' || c + n > 'z') {
                    c = (char)(c + n - 26);
                } else if('a' <= c && c + n > 'z') {
                    c = (char)(c + n - 26);
                } else {
                    c += n;
                }
            }

            answer.append(c);
        }

        return answer.toString();
    }
}
