package lv1.키패드누르기;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public String solution(int[] numbers, String hand) {
        Map<Integer, int[]> num_pad = new HashMap<Integer, int[]>() {{
            put(1, new int[]{0, 0}); put(2, new int[]{1, 0}); put(3, new int[]{2, 0});
            put(4, new int[]{0, 1}); put(5, new int[]{1, 1}); put(6, new int[]{2, 1});
            put(7, new int[]{0, 2}); put(8, new int[]{1, 2}); put(9, new int[]{2, 2});
            put(0, new int[]{1, 3});
        }};

        StringBuilder result = new StringBuilder();
        int lx = 0; int ly = 3;
        int rx = 2; int ry = 3;

        for(int n : numbers) {
            if(n == 1 || n == 4 || n == 7){
                result.append("L");
                lx = num_pad.get(n)[0]; ly = num_pad.get(n)[1];
            }

            else if (n == 3 || n == 6 || n == 9) {
                result.append("R");
                rx = num_pad.get(n)[0]; ry = num_pad.get(n)[1];
            }

            else {
                int loc = num_pad.get(n)[1];

                if(Math.abs(lx-1) + Math.abs(ly-loc) < Math.abs(rx-1) + Math.abs(ry-loc)){
                    result.append("L");
                    lx = 1; ly = loc;
                }

                else if (Math.abs(lx-1) + Math.abs(ly-loc) > Math.abs(rx-1) + Math.abs(ry-loc)) {
                    result.append("R");
                    rx = 1; ry = loc;
                }

                else {

                    if(hand.equals("left")){
                        result.append("L");
                        lx = 1; ly = loc;
                    }

                    else {
                        result.append("R");
                        rx = 1; ry = loc;
                    }

                }
            }

        }

        return String.valueOf(result);
    }
}
