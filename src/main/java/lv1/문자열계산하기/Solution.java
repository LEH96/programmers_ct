package lv1.문자열계산하기;

import java.util.Arrays;

public class Solution {
    public int solution(String my_string) {
        my_string = my_string.replaceAll(" - "," + -");
        my_string = my_string.replaceAll(" + ","");
        String[] nums = my_string.split("");
        return Arrays.stream(nums).mapToInt(Integer::parseInt).sum();
    }
}
