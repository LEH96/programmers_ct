package lv1.solved.푸드파이트대회;

public class Solution {
    public String solution(int[] food) {
        StringBuilder str = new StringBuilder();

        for(int i=1 ; i < food.length ; i++)
            if(food[i] > 1)
                str.append(String.valueOf(i).repeat(food[i] / 2));

        StringBuilder str2 = new StringBuilder();
        for(int i= str.length()-1 ; i>=0 ; i--){
            str2.append(str.charAt(i));
        }

        return str+"0"+ str2;
    }
}
