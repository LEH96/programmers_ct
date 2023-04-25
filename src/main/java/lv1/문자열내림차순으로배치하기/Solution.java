package lv1.문자열내림차순으로배치하기;

import java.util.Arrays;

public class Solution {
    public String solution(String s) {
        char[] cArr = s.toCharArray();
        Arrays.sort(cArr);

        s = new String(cArr);
        return new StringBuilder(s).reverse().toString();
    }
}
