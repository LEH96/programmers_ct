package lv0.겹치는선분의길이;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Solution {
    public int solution(int[][] lines) {
        List<Integer> result = new ArrayList<>();
        for (int[] line : lines) {
            int a = line[0];
            int b = line[1];
            for (int k = a; k < b; k++) {
                result.add(k);
            }
        }

        HashSet<Integer> numsOfResult = new HashSet<>(result);
        int sum = 0;
        for(int num : numsOfResult){
            if(Collections.frequency(numsOfResult, num) > 1)
                sum++;
        }
        return sum;
    }
}
