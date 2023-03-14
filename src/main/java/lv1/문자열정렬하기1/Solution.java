package lv1.문자열정렬하기1;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int[] solution(String my_string) {
        List<Integer> numbers = new ArrayList<>();
        for(int i=0 ; i<my_string.length() ; i++){
            char c = my_string.charAt(i);
            if(Character.isDigit(c))
                numbers.add(Integer.parseInt(c+""));
        }

        return numbers.stream().sorted().mapToInt(Integer::intValue).toArray();
    }
}
