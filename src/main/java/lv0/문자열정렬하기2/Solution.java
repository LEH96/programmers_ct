package lv0.문자열정렬하기2;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Solution {
    public String solution(String my_string) {
        String[] c = new String[my_string.length()];
        for(int i=0;i<my_string.length();i++){
            c[i] = my_string.toLowerCase().charAt(i)+"";
        }

        String newStr = Arrays.stream(c).sorted().collect(Collectors.joining());
        return newStr;
    }
}
