package lv0.삼각형의완성조건1;

import java.util.Arrays;

public class 삼각형의완성조건1 {
    class Solution {
        public int solution(int[] sides) {
            int max = Arrays.stream(sides).max().getAsInt();
            int sum = Arrays.stream(sides).sum();
            return (max < sum-max)? 1 : 2;
        }
    }
}
