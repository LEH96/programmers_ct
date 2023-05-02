package lv1.solved.숫자문자열과영단어;

import java.util.Arrays;
import java.util.List;

public class Solution {
    public int solution(String s) {
        List<String> nums_in_eng = Arrays.asList("zero", "one", "two", "three", "four", "five", "six", "seven","eight", "nine");
        StringBuilder answer = new StringBuilder();
        String n = "";

        for(char c : s.toCharArray()){
            if('0' <= c && c <= '9')
                answer.append(c);
            else {
                n += c;
                if(nums_in_eng.contains(n)) {
                    answer.append(nums_in_eng.indexOf(n));
                    n = "";
                }
            }
        }

        return Integer.parseInt(answer.toString());
    }
}
