package lv1.직사각형넓이구하기;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public int solution(int[][] dots) {
        List<Integer> len = new ArrayList<>();
        for(int i:new int[]{1,2,3}){
            len.add(Math.abs(dots[0][0]-dots[i][0])+Math.abs(dots[0][1]-dots[i][1]));
        }

        len.remove(Collections.max(len));
        return len.get(0) * len.get(1);
    }
}
