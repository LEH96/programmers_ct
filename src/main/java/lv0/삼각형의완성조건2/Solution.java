package lv0.삼각형의완성조건2;

import java.util.Arrays;

public class Solution {
    public int solution(int[] sides) {
        int sum = Arrays.stream(sides).sum();
        int max = Arrays.stream(sides).max().getAsInt();
        int min = Arrays.stream(sides).min().getAsInt();
        return sum - (max - min) - 1;
    }
}
