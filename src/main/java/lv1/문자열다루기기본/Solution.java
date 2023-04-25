package lv1.문자열다루기기본;

public class Solution {
    public boolean solution(String s) {
        for(char c : s.toCharArray())
            if(!('0' <= c && c <= '9'))
                return false;

        if(s.length() != 4 && s.length() != 6)
            return false;

        return true;
    }
}
