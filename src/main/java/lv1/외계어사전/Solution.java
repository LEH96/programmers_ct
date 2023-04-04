package lv1.외계어사전;

import java.util.Arrays;

public class Solution {
    public int solution(String[] spell, String[] dic) {
        Arrays.sort(spell);
        for(String d:dic){
            String[] strArrD = d.split("");
            Arrays.sort(strArrD);
            if(Arrays.equals(strArrD, spell))
                return 1;
        }
        return 2;
    }
}
