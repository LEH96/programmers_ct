package lv1.solved.삼진법뒤집기;

public class Solution {
    public int solution(int n) {
        StringBuilder tenaryN = new StringBuilder(Integer.toString(n, 3));
        tenaryN.reverse();
        return Integer.parseInt(String.valueOf(tenaryN),3);
    }
}
