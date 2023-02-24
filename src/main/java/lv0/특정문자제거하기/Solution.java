package lv0.특정문자제거하기;

public class Solution {
    public static void main(String[] args){
        System.out.println(solution("hello","l"));
    }
    public static String solution(String my_string, String letter) {
        String answer = "";
        for(int i=0;i<my_string.length();i++){
            String s =  my_string.substring(i,i+1);
            if(!s.equals(letter)) {
                answer += s;
            }
        }
        return answer;
    }
}
