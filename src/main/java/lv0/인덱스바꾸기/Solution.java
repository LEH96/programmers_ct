package lv0.인덱스바꾸기;

import java.util.Arrays;

public class Solution {
    public String solution(String my_string, int num1, int num2) {
        char[] chars = my_string.toCharArray();

        char tmp = chars[num1];
        chars[num1] = chars[num2];
        chars[num2] = tmp;

        return new String(chars);
    }
}
