package lv1.가장가까운같은글자;

import java.util.*;

public class Solution {
    public int[] solution(String s) {
        Map<Character, Integer> loc = new LinkedHashMap<>();
        for(char c : s.toCharArray()){
            if(!loc.containsKey(c))
                loc.put(c, -1);
        }

        int[] answer = new int[s.length()];
        for(int i=0 ; i<s.length() ; i++) {
            if(loc.get(s.charAt(i)) == -1)
                answer[i] = -1;
            else
                answer[i] = i - loc.get(s.charAt(i));
            loc.put(s.charAt(i), i);
        }

        return answer;
    }
}
