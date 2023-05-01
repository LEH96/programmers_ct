package lv1.solved.최소직사각형;

import java.util.Arrays;

public class Solution {
    public int solution(int[][] sizes) {
        int[] width = new int[sizes.length];
        int[] height = new int[sizes.length];
        for(int i=0 ; i< sizes.length ; i++){
            width[i] = Math.max(sizes[i][0], sizes[i][1]);
            height[i] = Math.min(sizes[i][0], sizes[i][1]);
        }

        int max_width = Arrays.stream(width).max().getAsInt();
        int max_height = Arrays.stream(height).max().getAsInt();
        return max_width * max_height;
    }
}
