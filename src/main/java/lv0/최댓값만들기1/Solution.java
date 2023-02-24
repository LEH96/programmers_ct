package lv0.최댓값만들기1;

import java.util.Arrays;

public class Solution {
    public int solution(int[] numbers) {
        int[] arr = Arrays.stream(numbers).sorted().toArray();
        return arr[arr.length-1] * arr[arr.length-2];
    }
}
