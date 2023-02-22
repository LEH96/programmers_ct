package lv0;

public class 피자나눠먹기3 {
    public class Solution {
        public int solution(int slice, int n) {
            return (n%slice==0) ? n/slice : n/slice+1;
        }
    }
}
