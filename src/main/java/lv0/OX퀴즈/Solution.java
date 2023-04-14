package lv0.OX퀴즈;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public String[] solution(String[] quiz) {
        String[] e;
        List<String> chk = new ArrayList<>();

        for(String s : quiz){
            e = s.split(" = ");
            e[0] = e[0].replace(" - "," + -");
            String[] exp = e[0].split(" \\+ ");
            String addExp = String.valueOf(Integer.parseInt(exp[0]) + Integer.parseInt(exp[1]));
            chk.add(e[1].equals(addExp) ? "O" : "X");
        }

        return chk.toArray(new String[0]);
    }
}
