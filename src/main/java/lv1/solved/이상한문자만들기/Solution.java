package lv1.solved.이상한문자만들기;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public String solution(String s) {
        List<String> answer = new ArrayList<>();
        String trans;

        for(String word : s.split(" ", -1)) {
            trans = "";
            word = word.toLowerCase();

            for (int i = 0; i < word.length(); i++) {
                if (i % 2 == 0)
                    trans += word.substring(i, i + 1).toUpperCase();
                else
                    trans += word.charAt(i);
            }

            answer.add(trans);
        }

        return String.join(" ", answer);
    }
}
