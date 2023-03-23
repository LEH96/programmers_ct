package lv0.배열회전시키기;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int[] solution(int[] numbers, String direction) {
        List<Integer> nums = new ArrayList<>();

        if(direction.equals("left")){
            for(int i=1;i<numbers.length;i++)
                nums.add(numbers[i]);
            nums.add(numbers[0]);
        } else {
            nums.add(numbers[numbers.length-1]);
            for(int i=0;i<numbers.length-1;i++)
                nums.add(numbers[i]);
        }

        return nums.stream().mapToInt(Integer::intValue).toArray();
    }
}
