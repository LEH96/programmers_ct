package lv1.약수의개수와덧셈;

public class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        for(int n=left ; n<=right ; n++)
            if(divisor_nums(n) % 2 == 0)
                answer += n;
            else
                answer -= n;

        return answer;
    }

    private int divisor_nums(int n) {
        int result = 0;
        for(int i=1 ; i<=n ; i++)
            if(n % i == 0)
                result += 1;

        return result;
    }
}
