package lv1.다항식더하기;

public class Solution {
    public String solution(String polynomial) {
        int[] answer = {0, 0};
        String[] p = polynomial.split(" + ");
        for(String x:p){
            if((String.valueOf(x.charAt(x.length() - 1))).equals("x"))
                answer[0] = answer[0] + 1;
        }
        p = polynomial.split(sep=" + ")
        for x in p:
        if x[-1] == "x":
        answer[0] += 1 if x == "x" else int(x[:-1])
            else:
        answer[1] += int(x)

        if answer[0] == 0:
        return str(answer[1]) if answer[1] != 0 else "0"
        else:
        if answer[1] == 0:
        return ("{}x".format(answer[0]) if answer[0] != 1 else "x")
            else:
        return ("{}x + {}".format(answer[0], answer[1]) if answer[0] != 1 else "x + {}".format(answer[1]))
    }
}
