package lv1.가장가까운같은글자;

public class Solution {
    public int[] solution(String s) {
        loc = {}
        for i in set(s):
        loc[i] = -1

        answer = []
        for i in range(len(s)):
        if loc[s[i]] == -1:
        answer.append(-1)
            else:
        answer.append(i - loc[s[i]])
        loc[s[i]] = i

        return answer
    }
}
