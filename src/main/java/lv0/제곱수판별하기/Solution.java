package lv0.제곱수판별하기;

public class Solution {
    public int solution(int n) {
        return (Math.sqrt(n) - (int)Math.sqrt(n) > 0) ? 2 : 1;
    }
}
