package lv0.평행;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int solution(int[][] dots) {
        List<Integer> x = new ArrayList<>();
        List<Integer> y = new ArrayList<>();

        for(int[] dot:dots){
            x.add(dot[0]);
            y.add(dot[1]);
        }

        if(Math.abs((y.get(1) - y.get(0))/(x.get(1) - x.get(0))) == Math.abs((y.get(3) - y.get(2))/(x.get(3) - x.get(2))))
            return 1;
        if(Math.abs((y.get(3) - y.get(0))/(x.get(3) - x.get(0))) == Math.abs((y.get(2) - y.get(1))/(x.get(2) - x.get(1))))
            return 1;
        return 0;
    }
}
