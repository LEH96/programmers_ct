package lv0.문자열안에문자열;

public class Solution {
    public int solution(String str1, String str2) {
        return (str1.contains(str2))? 1 : 2;
    }
}
