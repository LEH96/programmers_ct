package lv0.한번만등장한문자;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution {
    public String solution(String s) {
        //문자열리스트에 한문자씩 담기
        List<String> strlist = new ArrayList<>();
        for(int i=0;i<s.length();i++){
            strlist.add(s.charAt(i)+"");
        }

        //리스트에서 문자 개수를 세고 한개만 있는 문자를 문자열에 추가
        String answer = "";
        for(String c:strlist){
            if(Collections.frequency(strlist,c) == 1)
                answer += c;
        }

        //문자열을 정렬한 뒤 반환
        char[] chs = answer.toCharArray();
        Arrays.sort(chs);
        return new String(chs);
    }
}
