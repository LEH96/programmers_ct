package lv0.암호해독;

public class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        for(int i = -1 + code;i<cipher.length();i=i+code){
            answer += cipher.charAt(i);
        }
        return answer;
    }
}
