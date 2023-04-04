package lv0.칠의개수;

public class Solution {
    public int solution(int[] array) {
        int sevens = 0;
        for(int n:array){
            String num = String.valueOf(n);
            while(num.contains("7")){
                num = num.replaceFirst("7","");
                sevens++;
            }
        }
        return sevens;
    }
}
