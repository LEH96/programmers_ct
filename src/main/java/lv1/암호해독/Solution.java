package lv1.μνΈν΄λ;

public class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        for(int i = -1 + code;i<cipher.length();i=i+code){
            answer += cipher.charAt(i);
        }
        return answer;
    }
}
