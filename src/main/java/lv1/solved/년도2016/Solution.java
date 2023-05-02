package lv1.solved.년도2016;

public class Solution {
    public String solution(int a, int b) {
        String[] days = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
        int[] days_of_month = {31,29,31,30,31,30,31,31,30,31,30,31};
        int d = 0;

        for(int i=0 ; i<a-1 ; i++){
            if(a > 1)
                d += days_of_month[i];
        }

        d = (d + b)% 7 - 3;
        return days[d < 0 ? d+7 : d];
    }
}
