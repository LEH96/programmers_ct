package lv0.피자나눠먹기2;

public class Solution {
    public int solution(int n) {
        int pizza = 1;
        while((pizza * 6) % n != 0)
            pizza += 1;
        return pizza;
    }
}
