package lv1.옹알이2;

public class Solution {
    public int solution(String[] babbling) {
        String[] pron = {"aya", "ye", "woo", "ma"};
        int answer = 0;

        for(String b : babbling){
            for(String p : pron){
                String double_pron = p + p;
                if(b.contains(double_pron))
                    break;
                if(b.contains(p))
                    b = b.replaceAll(p, " ");
            }

            if(b.trim().isEmpty())
                answer++;
        }

        return answer;
    }
}
