package lv1.solved.문자열내마음대로정렬하기;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    public String[] solution(String[] strings, int n) {
        Arrays.sort(strings);
        Arrays.sort(strings, Comparator.comparingInt(s -> s.charAt(n)));
        return strings;
    }
}
