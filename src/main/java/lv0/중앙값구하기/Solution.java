package lv0.중앙값구하기;

import java.util.Arrays;

public class Solution {
    public int solution(int[] array) {
        int mid = array.length / 2;
        Arrays.sort(array);
        int answer = array[mid];
        return answer;
    }
}
