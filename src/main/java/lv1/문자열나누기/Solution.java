package lv1.문자열나누기;

public class Solution {
    public int solution(String s) {
        int x = 0; int not_x = 0;
        int idx = 0;
        int split_num = 0;

        while(!s.isBlank()) {
            if(s.charAt(idx) == s.charAt(0)) { x++; }
            else { not_x++; }

            if(x == not_x){
                s = s.substring(idx+1);
                split_num++;
                x = 0; not_x = 0; idx = 0;
                continue;
            }

            if(idx == s.length() - 1){
                split_num++;
                break;
            }

            idx++;
        }

        return split_num;
    }
}
