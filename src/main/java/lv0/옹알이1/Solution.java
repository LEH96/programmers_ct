package lv0.옹알이1;

public class Solution {
    public int solution(String[] babbling) {
        String[] pron = {"aya", "ye", "woo", "ma"};

        int answer = 0;
        for(String b : babbling){
            for(String p : pron)
                if(b.contains(p))
                    b = b.replace(p," ");

            b = b.trim();
            if(b.equals(""))
                answer++;
        }

        return answer;
    }
}
