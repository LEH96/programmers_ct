package lv0.이진수더하기;

public class Solution {
    public String solution(String bin1, String bin2) {
        return Integer.toString(Integer.parseInt(bin1,2) + Integer.parseInt(bin2,2), 2);
    }
}
