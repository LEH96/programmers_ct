package lv0.팩토리얼;

public class Solution {
    public int solution(int n) {
        int fact = 1;
        for(int i=2;i<=10;i++){
            fact *= i;
            if(fact == n)
                return i;
            else if (fact > n) {
                return i-1;
            }
        }

        return -1;
    }
}
