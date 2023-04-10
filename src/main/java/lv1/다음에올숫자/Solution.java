package lv1.다음에올숫자;

public class Solution {
    public int solution(int[] common) {
        if(common[1] - common[0] == common[2] - common[1])
            return common[common.length-1] + (common[1] - common[0]);
        else
            return common[common.length-1] * (common[2] / common[1]);
    }
}
