package lv1.A로B만들기;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int solution(String before, String after) {
        List<String> beforeList = new ArrayList<>();
        for(int i=0 ; i<before.length() ; i++){
            beforeList.add(before.charAt(i)+"");
        }

        for(int i=0; i<after.length() ; i++) {
            if(beforeList.contains(after.charAt(i)+""))
                beforeList.remove(after.charAt(i)+"");
        }

        return beforeList.size() < 1 ? 1 : 0;
    }
}
