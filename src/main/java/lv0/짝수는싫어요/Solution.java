package lv0.짝수는싫어요;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(11)));
    }
   public static int[] solution(int n) {
        int[] answer;
        int idx = 0;

        answer = (n%2 != 0) ? new int[n/2+1] : new int[n/2];

       for(int num=1;num<=n;num+=2) {
           answer[idx++] = num;
       }

        return answer;
    }
}
