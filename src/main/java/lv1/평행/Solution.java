package lv1.평행;

public class Solution {
    public int solution(int[][] dots) {
        x = [dot[0] for dot in dots]
        y = [dot[1] for dot in dots]
        if abs((y[1]-y[0])/(x[1]-x[0])) == abs((y[3]-y[2])/(x[3]-x[2])):
        return 1
        if abs((y[3]-y[0])/(x[3]-x[0])) == abs((y[2]-y[1])/(x[2]-x[1])):
        return 1
        return 0
    }
}
