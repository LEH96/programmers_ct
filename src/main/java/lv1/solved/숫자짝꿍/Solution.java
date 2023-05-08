package lv1.solved.숫자짝꿍;

public class Solution {
    public String solution(String X, String Y) {
        String answer = "";

        for(int i=9 ; i>=0 ; i--){
            int count_of_i_inX = X.length() - X.replaceAll(String.valueOf(i),"").length();
            int count_of_i_inY = Y.length() - Y.replaceAll(String.valueOf(i),"").length();
            answer += String.valueOf(i).repeat(Math.min(count_of_i_inX, count_of_i_inY));
        }
        
        if(answer.equals(""))
            return "-1";
        else if (answer.equals("0".repeat(answer.length()))) {
            return "0";
        }
        else
            return answer;
    }
}
