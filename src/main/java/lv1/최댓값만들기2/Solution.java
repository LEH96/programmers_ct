package lv1.최댓값만들기2;

import java.util.Arrays;

public class Solution {
    public int solution(int[] numbers) {
        int[] sorted_num = Arrays.stream(numbers).sorted().toArray();

        int num1 = sorted_num[0] * sorted_num[1];
        int num2 = sorted_num[numbers.length - 1] * sorted_num[numbers.length - 2];
        return Math.max(num1, num2);
    }
}
