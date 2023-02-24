package lv0.배열두배만들기;

import java.util.Arrays;

public class Solution {
    public static int[] solution(int[] numbers) {
        int idx = 0;
        for(int n: numbers){
            numbers[idx++] = n * 2;
        }
        return numbers;
    }
}
