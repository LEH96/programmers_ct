package lv1.영어가싫어요;

public class Solution {
    public long solution(String numbers) {
        String[] numberArr = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        int num = 0;
        for(String n:numberArr){
            if(numbers.contains(n))
                numbers = numbers.replaceAll(n, String.valueOf(num));
            num++;
        }
        return Long.parseLong(numbers);
    }
}
