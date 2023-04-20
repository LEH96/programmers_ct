package lv1.solved.평균구하기;

import java.util.Arrays;

public class Solution {
    public double solution(int[] arr) {
        return (double) Arrays.stream(arr).sum() / arr.length;
    }
}
