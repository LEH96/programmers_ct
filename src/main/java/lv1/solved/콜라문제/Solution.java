package lv1.solved.콜라문제;

public class Solution {
    public int solution(int a, int b, int n) {
        int now = n;
        int get;
        int keep;
        int total = 0;

        while(now >= a){
            get = now / a * b;
            keep = now % a;
            total += get;
            now = get + keep;
        }

        return total;
    }
}
