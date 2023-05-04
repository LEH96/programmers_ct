package lv1.로또의최고순위와최저순위;

import java.util.Arrays;

public class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int correct = 0;
        int zero = 0;

        for(int num : lottos){
            if(num == 0)
                zero++;
            else if(Arrays.stream(win_nums)
                            .filter(n -> n == num)
                            .findFirst()
                            .orElse(-1) != -1)
                correct++;
        }

        if(correct == 0)
            return zero == 6 ? new int[]{1,6} : new int[]{6,6};
        else
            return new int[]{7-(correct+zero),7-correct};
    }
}
