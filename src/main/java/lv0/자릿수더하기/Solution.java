package lv0.자릿수더하기;

public class Solution {
    public static int solution(int n) {
        int answer = 0;
//        while(n>0){
//            answer += n % 10;
//            n /= 10;
//        }
        String nStr = n + "";
        for(int i=0;i<nStr.length();i++){
            answer += Character.getNumericValue(nStr.charAt(i));
        }
        return answer;
    }
}
