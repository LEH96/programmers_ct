package lv1.진료순서정하기;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public int[] solution(int[] emergency) {
        int[] rank = new int[emergency.length];
        List<Integer> sorted_arr = new ArrayList<>();

        int[] sorted_emer = Arrays.stream(emergency).sorted().toArray();
        for(int i=sorted_emer.length-1 ; i >= 0 ; i--)
            sorted_arr.add(sorted_emer[i]);

        for(int i=0;i<rank.length;i++)
            rank[i] = sorted_arr.indexOf(emergency[i]) + 1;;

        return rank;
    }
}
