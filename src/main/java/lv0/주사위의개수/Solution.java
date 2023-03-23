package lv0.주사위의개수;

public class Solution {
    public int solution(int[] box, int n) {
        int x = box[0];
        int y = box[1];
        int z = box[2];
        return (x / n) * (y / n) * (z / n);
    }
}
