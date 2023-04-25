package lv1.부족한금액계산하기;

public class Solution {
    public long solution(int price, int money, int count) {
        int total = price * count * (count+1) / 2;
        if(total > money)
            return total - money;
        else
            return 0;
    }
}
