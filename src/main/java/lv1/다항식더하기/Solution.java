package lv1.다항식더하기;

public class Solution {
    public String solution(String polynomial) {
        int[] answer = {0, 0};
        String[] p = polynomial.split(" \\+ ");
        for(String x : p){
            if((String.valueOf(x.charAt(x.length() - 1))).equals("x"))
                if(x.equals("x"))
                    answer[0] = answer[0] + 1;
                else
                    answer[0] = answer[0] + Integer.parseInt(x.substring(0,x.length()-1));
            else
                answer[1] = answer[1] + Integer.parseInt(x);
        }

        if(answer[0] == 0)
            return answer[1] != 0 ? String.valueOf(answer[1]) : "0";
        if(answer[1] == 0)
            return answer[0] != 1 ? answer[0] + "x" : "x";
        return answer[0] != 1 ? answer[0] + "x + " + answer[1] : "x + " + answer[1];
    }
}
