package lv0.아이스아메리카노;

public class Solution {
    public int[] solution(int money) {
        int buy = money / 5500;
        int remain = money - buy * 5500;
        int []answer = {buy, remain};
        return answer;
    }
}
