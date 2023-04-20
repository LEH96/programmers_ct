package lv1.solved.문자열내p와y의개수;

public class Solution {
    boolean solution(String s) {
        s = s.toLowerCase();
        long pCnt = s.chars().filter(c -> c == 'p').count();
        long yCnt = s.chars().filter(c -> c == 'y').count();
        return pCnt == yCnt;
    }
}
