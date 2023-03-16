package lv1.가장큰수찾기;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Solution {
    public int[] solution(int[] array) {
        int[] result = new int[2];

        result[0] = Arrays.stream(array).max().getAsInt();
        result[1] = Arrays.stream(array)
                            .boxed()
                            .collect(Collectors.toList())
                            .indexOf(result[0]);
        return result;
    }
}
