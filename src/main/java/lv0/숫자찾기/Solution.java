package lv0.숫자찾기;

public class Solution {
    public int solution(int num, int k) {
        String numbers = num + "";

        for(int i=0;i<numbers.length();i++){
            if(numbers.substring(i,i+1).equals(k+"")){
                return i+1;
            }
        }

        return -1;
    }
}
