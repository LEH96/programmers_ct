package lv1.x만큼간격이있는n개의숫자;

public class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];

        if(x > 0)
            for(int i=x ; i<=x*n ; i+=x)
                answer[i] = i;
        else if(x < 0)
            for(int i=x ; i<x*n ; i+=x)
                answer[i] = i;

        return answer;ss
    }
}
