package lv1.숨어있는숫자의덧셈2;

import java.util.Arrays;

public class Solution {
    public int solution(String my_string) {
        String[] strs = my_string.split("[A-Za-z]");
        int sum = 0;
        for(String s : strs){
            if(!s.equals(""))
                sum += Integer.parseInt(s);
        }
        return sum;
    }
}
