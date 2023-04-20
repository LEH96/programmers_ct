package lv1.solved.하샤드수;

public class Solution {
    public boolean solution(int x) {
        String[] num = String.valueOf(x).split("");
        int sumOfX = 0;
        for(String n : num)
            sumOfX += Integer.parseInt(n);

        return x % sumOfX == 0;
    }
}
