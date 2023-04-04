package lv0.잘라서배열로저장하기;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public String[] solution(String my_str, int n) {
        List<String> answer = new ArrayList<>();
        for(int i=0;i<my_str.length();i+=n){
            String str = "";
            if(i+n < my_str.length())
                str = my_str.substring(i,i+n);
            else
                str = my_str.substring(i, my_str.length());
            answer.add(str);
        }
        return answer.toArray(new String[0]);
    }
}
