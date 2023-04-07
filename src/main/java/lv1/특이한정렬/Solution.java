package lv1.특이한정렬;

public class Solution {
    public int[] solution(int[] numlist, int n) {

        diff = sorted([(abs(num - n), -num) for num in numlist])
        answer = [-diff[i][1] for i in range(len(numlist))]
        return answer
    }
}
