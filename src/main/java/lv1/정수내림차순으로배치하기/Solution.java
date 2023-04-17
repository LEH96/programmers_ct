package lv1.정수내림차순으로배치하기;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    public long solution(long n) {
        String[] strArr = String.valueOf(n).split("");
        Arrays.sort(strArr, Comparator.reverseOrder());
        return Long.parseLong(String.join("", strArr));
    }
}
